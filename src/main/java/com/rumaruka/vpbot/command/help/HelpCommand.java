package com.rumaruka.vpbot.command.help;


import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelpCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message = event.getMessage();
       String s = message.getContentRaw();
        if(s.equalsIgnoreCase("vp!help_calc")){
            event.getChannel().sendMessage("vp!calc - Команда, которая высчитывает за вас решение. Доступны: сложение(add), вычитания(sub), умножение(mult), деление(div), возведение в степень(pow) и корень(sqrt)").queue();
        }



    }
}
