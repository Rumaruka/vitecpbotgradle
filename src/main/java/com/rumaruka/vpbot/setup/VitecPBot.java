package com.rumaruka.vpbot.setup;

import com.rumaruka.vpbot.command.help.HelpCommand;
import com.rumaruka.vpbot.command.help.HelpForAllCommand;
import com.rumaruka.vpbot.command.misc.Calculate;
import com.rumaruka.vpbot.command.misc.Time;
import com.rumaruka.vpbot.command.owner.UserInfo;
import com.rumaruka.vpbot.command.utils.VoteCmd;
import com.rumaruka.vpbot.event.EventBotListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class VitecPBot {

    public static void main(String args[]) throws Exception {
        JDA bot = new JDABuilder(AccountType.BOT).setToken("NTI5NjY5OTcwMjA5Mjc1OTQ0.Dw0QVA.CMq1Av794mZhV_FlPTcVXxOND2g").build();
        bot.addEventListener(new EventBotListener());
        bot.addEventListener(new Calculate());
        bot.addEventListener(new HelpCommand());
     bot.addEventListener(new UserInfo());
      bot.addEventListener(new HelpForAllCommand());
       // bot.addEventListener(new LoggingEvent());
        bot.addEventListener(new VoteCmd());
       bot.addEventListener(new Time());
    }
}
