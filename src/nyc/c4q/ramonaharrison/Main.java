package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.model.Channel;
import nyc.c4q.ramonaharrison.model.Message;
import nyc.c4q.ramonaharrison.network.Slack;
import nyc.c4q.ramonaharrison.network.response.ListChannelsResponse;
import nyc.c4q.ramonaharrison.network.response.ListMessagesResponse;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();
        myBot.listMessages(Slack.BOTS_CHANNEL_ID);


        ListMessagesResponse listMessagesResponse = Slack.listMessages("C2ABKERFT");
        List<Message> messages = listMessagesResponse.getMessages();
        System.out.println(messages);


        Timer timer = new Timer();
        final String[] fact = new String[1];
        fact[0] = "TEST";
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Random random = new Random();
                fact[0] = getAccuse(random);
                myBot.sendMessageToBotsChannel(fact[0]);
            }
        };
        timer.schedule(task, 10000, 1000000000);
    }

    public static String getAccuse(Random random){

        ArrayList<String> accuseThem = new ArrayList<>();

        accuseThem.add("... ");
        accuseThem.add("...are you trying to take over the world?...because you're so good at it");
        accuseThem.add("I think you're an alien because your homework presentation from last week was supernova!");
        accuseThem.add("... alien invaders because they are... that smart");
        accuseThem.add("Hey...Alien...can I please copy your code");
        accuseThem.add("What? your name is Alien? You guys have high tech stuff");
        accuseThem.add("Is your TEAM a UFO? You guys are so smart. ");


        int fact = random.nextInt(7);
        System.out.println(accuseThem.get(fact));
        return accuseThem.get(fact);

    }

}