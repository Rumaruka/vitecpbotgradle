package com.rumaruka.vpbot.command.misc;


import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Calculate extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String[] message = e.getMessage().getContentRaw().split(" ");


        if(message.length == 1 && message[0].equalsIgnoreCase("vp!calc")){
            e.getChannel().sendMessage("Правильное использование команды: vp!calc [add/sub/mult/slpit/pow/sqrt] [первое число] [второе число, если не выбран sqrt] или используйте команду vp!help_calc для того, чтобы узнать функции вычисления").queue();
        }else if(message[0].equalsIgnoreCase("vp!calc") && message[1].equalsIgnoreCase("add")){
            float num1 = Float.parseFloat(message[2]);
            float num2 = Float.parseFloat(message[3]);
            e.getChannel().sendMessage("Решение: " + (num1 + num2)).queue();

        }
        else if(message[0].equalsIgnoreCase("vp!calc") && message[1].equalsIgnoreCase("sub")){
            float num1 = Float.parseFloat(message[2]);
            float num2 = Float.parseFloat(message[3]);
            e.getChannel().sendMessage("Решение: " + (num1 - num2)).queue();
        }
        else if(message[0].equalsIgnoreCase("vp!calc") && message[1].equalsIgnoreCase("mult")){
            float num1 = Float.parseFloat(message[2]);
            float num2 = Float.parseFloat(message[3]);
            e.getChannel().sendMessage("Решение: " + (num1 * num2)).queue();

    }
        else if(message[0].equalsIgnoreCase("vp!calc") && message[1].equalsIgnoreCase("div")){
            float num1 = Float.parseFloat(message[2]);
            float num2 = Float.parseFloat(message[3]);


            e.getChannel().sendMessage("Решение: " + (num1 / num2)).queue();





        }
        else if(message[0].equalsIgnoreCase("vp!calc") && message[1].equalsIgnoreCase("pow")){
            float num1 = Float.parseFloat(message[2]);
            float num2 = Float.parseFloat(message[3]);
            e.getChannel().sendMessage("Решение: " + (Math.pow(num1,num2))).queue();

        }
        else if(message[0].equalsIgnoreCase("vp!calc") && message[1].equalsIgnoreCase("sqrt")){
            float num1 = Float.parseFloat(message[2]);
            e.getChannel().sendMessage("Решение: " + (Math.sqrt(num1))).queue();


        }

    }

}
