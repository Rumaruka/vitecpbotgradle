package com.rumaruka.vpbot.command.misc;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.format.DateTimeFormatter;

public class Time extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        super.onMessageReceived(event);
        Message message = event.getMessage();
        String s = message.getContentRaw();
        if(s.equalsIgnoreCase("vp!time")){
            event.getChannel().sendMessage("Время" + ": "+ event.getMessage().getTimeCreated().format(DateTimeFormatter.RFC_1123_DATE_TIME)).queue();

        }
    }
}
