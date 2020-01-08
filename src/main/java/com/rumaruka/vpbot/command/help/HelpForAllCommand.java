package com.rumaruka.vpbot.command.help;


import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class HelpForAllCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String message=event.getMessage().getContentRaw();
        String channel = event.getChannel().getName();


        String HELP_CALC = "помощью с калькулятором";
        String TIME = "Время в формате GMT (Среднее время по Гринвичу)";
         if(message.equalsIgnoreCase("vp!help")&&!(channel.equalsIgnoreCase("bots-commands"))){
            event.getTextChannel().sendMessage("Команда выполняется тут - #bots-commands").queue();
        }
        if(message.equalsIgnoreCase("vp!help")&&channel.equalsIgnoreCase("bots-commands")){
            EmbedBuilder em = new EmbedBuilder().setColor(Color.GREEN);
            em.setDescription("Тут помощь в команде"  + ":")
                    .addField("vp!help_calc", HELP_CALC, false)
                    .addField("vp!time",TIME,false);


            event.getTextChannel().sendMessage(
                    em.build()
            ).queue();

        }

    }

}
