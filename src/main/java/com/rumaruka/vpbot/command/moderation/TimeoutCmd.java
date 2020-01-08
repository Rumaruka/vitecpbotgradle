package com.rumaruka.vpbot.command.moderation;

import net.dv8tion.jda.api.events.message.MessageDeleteEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class TimeoutCmd  extends ListenerAdapter {


    @Override
    public void onMessageDelete(MessageDeleteEvent event) {
        super.onMessageDelete(event);
    }
}
