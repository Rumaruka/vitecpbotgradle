package com.rumaruka.vpbot.command.owner;



import net.dv8tion.jda.api.EmbedBuilder;

import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

public class UserInfo extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Member memb = event.getMember();

        String channel = event.getChannel().getName();
        String message =event.getMessage().getContentRaw();
        if(message.equalsIgnoreCase("vp!info")&&channel.equalsIgnoreCase("bots-commands")){

            String NAME = memb.getEffectiveName();
            String TAG = memb.getUser().getName() + "#" + memb.getUser().getDiscriminator();
            String GUILD_JOIN_DATE = memb.getTimeJoined().format(DateTimeFormatter.RFC_1123_DATE_TIME);
            String DISCORD_JOINED_DATE = memb.getUser().getTimeCreated().format(DateTimeFormatter.RFC_1123_DATE_TIME);
            String ID = memb.getUser().getId();
            String STATUS = memb.getOnlineStatus().toString();
            String ROLES = "";
            String GAME;
            String AVATAR = memb.getUser().getAvatarUrl();

            try {



            } catch (Exception e) {
                GAME = "-/-";
            }

            for ( Role r : memb.getRoles() ) {
                ROLES += r.getName() + ", ";
            }
            if (ROLES.length() > 0)
                ROLES = ROLES.substring(0, ROLES.length()-2);
            else
                ROLES = "Не имеет ролей на этом сервере.";

            if (AVATAR == null) {
                AVATAR = "Нет аватарки";
            }

            EmbedBuilder em = new EmbedBuilder().setColor(Color.GREEN);
            em.setDescription(":spy:   **Информация о пользователе " + memb.getNickname() + ":**")
                    .addField("Имя / Никнейм", NAME, false)
                    .addField("User Tag", TAG, false)
                    .addField("ID", ID, false)
                    .addField("Текущий статус", STATUS, false)
                  // .addField("Текущая игра", GAME, false)
                    .addField("Роли", ROLES, false)
                    .addField("Подключен к сереру", GUILD_JOIN_DATE, false)
                    .addField("Подключен к Discord", DISCORD_JOINED_DATE, false)
                    .addField("URL аватарки", AVATAR, false);

            if (AVATAR.isEmpty()) {
                em.setThumbnail(AVATAR);
            }

            event.getTextChannel().sendMessage(
                    em.build()
            ).queue();
        }
    }

}
