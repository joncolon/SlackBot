package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();
        //FunFacts funFacts = new FunFacts();
        //funFacts.randomFact();
        //myBot.sendMessageToBotsChannel(funFacts.randomFact(););

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);
        myBot.checkForMentions();
        if ((myBot.checkForMentions())) {
            System.out.println("Robotron was mentioned " + myBot.mentionCounter() + " times in the past 100 messages!");

            //TODO : Write some code here!

            // Post "Hello, world!" to the #bots channel
            //myBot.sendMessageToBotsChannel("Hello, world!");

            Timer timer = new Timer();
            final String[] fact = new String[1];
            fact[0] = "TEST";
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Random random = new Random();

                    fact[0] = getFact(random);
                    myBot.sendMessageToBotsChannel(fact[0]);
                }


            };

            timer.schedule(task, 1000, 120000);

            //myBot.sendFunFactMessagetoBotsChannel();

            // Post a pineapple photo to the #bots channel
            //myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

        }
    }







    public static String getFact(Random random){

        ArrayList<String> funfacts = new ArrayList<>();

//        switch (randomNum) {
        funfacts.add("Over 20,000 people have purchased alien abduction insurance. It costs $1 per year.");
        funfacts.add("Some firefighters in the United States are trained on how to treat aliens, in case of a UFO crash or invasion.");
        funfacts.add("Edgar Mitchell, the sixth person to walk on the moon, claims that “aliens have contacted humans several times”.");
        funfacts.add("The President of the World Chess Federation claims he was abducted and believes that chess was invented by aliens.");
        funfacts.add("In an effort to attract more tourism as well as extra-terrestrials, the town of St Paul, Alberta created the world's first UFO landing site.");
        funfacts.add("Three Days into the Apollo 11 Mission, the crew reported a strange flying object not far from their location. The team of NASA still cannot explain what kind of object it was.");
        funfacts.add("Astronomers of the Carnegie Institution in Washington, D.C., have compiled a list of 17,129 nearby stars most likely to have planets that could support life.");
        funfacts.add("Astronomer Frank Drake made the first scientific attempt to contact alien beings in 1960.");
        funfacts.add("Since 1995 the SETI Institute in Mountain View, California has privately funded the project to scan more than 1,000 stars for alien radio squeaks.");
        funfacts.add("Napoleon Bonaparte was another one who claimed he had been abducted by aliens. He truly was missing for several days in July 1794 and later was telling he was imprisoned by strange men. It’s hard to believe but scientists found a tiny foreign object embedded within the skeletal remains of Napoleon and announced the thing to be a micro chip.");
        funfacts.add("On February 24, 1942, hundreds of reports flooded a local Los Angeles air base claiming to have spotted a UFO.");
        funfacts.add("Researchers recently discovered a Martian rock in Antarctica that contained fossilized signs of nano bacteria. If this is the sign they left behind billions of years ago, what might they have evolved into today?\n");
        funfacts.add("It is trusted that Alien appearances depend on three reasons – a) an endeavor to impact the eventual fate of mankind, b) endeavor to caution or educate and c) experimental use.");
        funfacts.add("According to a report it is illegal for U.S. citizens to have any contact with\n" +
                     "extraterrestrials or their vehicles under Title 14, Section 1211 of the Code of Federal regulations, implemented on July 16, 1969.");
        funfacts.add("In the year 1883 an astronomer named Jose Bonilla in Zacatecas, Mexico, took the first photograph of a UFO");
        funfacts.add("BREAKING NEWS!!!! Long Island City has reported high volumes of alien activity!\n BE ON THE LOOKOUT FOR ANY WEIRD/ SUSPICIOUS ACTIVITY!!");
        funfacts.add("BREAKING NEWS!!!! Another UFO spotted 1 minute ago in Queens, NY");
        funfacts.add("BREAKING NEWS!!!!! Scientists say increasing evidence of aliens is surfacing.\n Officials state an abnormal amount of binary code coming from the Falchi building.");
        funfacts.add("BREAKING NEWS!!!!! The government has joined forces with local aliens to implement Java technologies");
        funfacts.add("BREAKING NEWS!!!!! Extra Terrestrials demand that everyone upgrade to Java 9 IMMEDIATELY!");
        funfacts.add("BREAKING NEWS!!!!! Aliens spotted roaming Earth's atmosphere");

        //int randomNum = (int)(Math.random() * 12);
        int fact = random.nextInt(20);
        System.out.println(funfacts.get(fact));
        return funfacts.get(fact);

        // myBot.sendMessageToBotsChannel("http://www.troll.me/images/ancient-aliens-guy/testing-aliens-thumb.jpg");


    }
}