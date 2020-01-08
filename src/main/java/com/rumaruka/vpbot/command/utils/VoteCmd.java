package com.rumaruka.vpbot.command.utils;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

import static com.rumaruka.vpbot.api.RolesServer.AdminModerationRoles.ADMIN_JUNIOR;


public class VoteCmd extends ListenerAdapter {

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        Message m = event.getMessage();
        User member = event.getAuthor();
        String ct = m.getContentRaw();
        String name = member.getName();


        if(ct.startsWith("vp!vote")&&event.getMember().getRoles().contains(event.getGuild().getRoleById(ADMIN_JUNIOR))){
            m.addReaction("\uD83D\uDC4D").queue();
            m.addReaction("\uD83D\uDC4E").queue();



        }
        else if(ct.startsWith("vp!vote")&&!(event.getMember().getRoles().contains(event.getGuild().getRoleById(ADMIN_JUNIOR)))){
            m.delete().queue();

        }
    }
}
