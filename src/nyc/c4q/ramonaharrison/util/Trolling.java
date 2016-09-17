package nyc.c4q.ramonaharrison.util;

import nyc.c4q.ramonaharrison.Bot;
import nyc.c4q.ramonaharrison.QuestionAnswer;
import nyc.c4q.ramonaharrison.WordLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by hakeemsackes-bramble on 9/17/16.
 */
public class Trolling {

    public static void timer() {

        Bot myBot = new Bot();

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


    public static String getAccuse(Random random) {

        ArrayList<String> accuseThem = new ArrayList<>();
        Random rand = new Random();
        int index = rand.nextInt(WordLists.names.length);

        accuseThem.add("... ? " + QuestionAnswer.explainingSentencePT(WordLists.pastTenseVerbs));
        accuseThem.add("yo " + WordLists.nouns[index] + " are you trying to take over the world?...because " + QuestionAnswer.explainingSentencePT(WordLists.pastTenseVerbs) + "s");
        accuseThem.add("I think you're an alien because your homework presentation from last week was supernova!");
        accuseThem.add(WordLists.nouns[index] + " is an alien invader because they are working with " + WordLists.nouns[index] + "s. that's weird considering " + QuestionAnswer.explainingSentencePT(WordLists.pastTenseVerbs));
        accuseThem.add("...Alien...can I please copy your code");
        accuseThem.add("What? " + WordLists.names[index] + " your name is Alien? You guys " + QuestionAnswer.explainingSentencePT(WordLists.pastTenseVerbs) + "s");
        accuseThem.add("hey " + WordLists.names[index] + ". does your TEAM have a " + WordLists.nouns[index] + "? You guys are so smart considering " + QuestionAnswer.explainingSentencePT(WordLists.pastTenseVerbs));


        int fact = random.nextInt(accuseThem.size());
        System.out.println(accuseThem.get(fact));
        return accuseThem.get(fact);

    }
}
