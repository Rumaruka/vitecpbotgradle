package com.rumaruka.vpbot.event;


import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Activity.ActivityType;
import net.dv8tion.jda.api.events.DisconnectEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.StatusChangeEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class EventBotListener extends ListenerAdapter {



    @Override
    public void onReady(ReadyEvent event) {
       event.getJDA().getPresence().setStatus(OnlineStatus.ONLINE);
       event.getJDA().getPresence().setActivity(Activity.of(ActivityType.STREAMING,"Смотрю Витю"));
   }

    @Override
    public void onStatusChange(StatusChangeEvent event) {


    }
    @Override
    public void onDisconnect(DisconnectEvent event) {
        event.getTimeDisconnected();
    }



}
