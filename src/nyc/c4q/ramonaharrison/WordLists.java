package nyc.c4q.ramonaharrison;

import java.util.HashMap;
import java.util.*;

/**
 * Created by hakeemsackes-bramble on 9/12/16.
 */
public class WordLists {
    public static void main(String[] args) {
        System.out.println(nouns);
    }
    public static String[] nouns = {
            "homework assignment",
            "beta wave",
            "atomizer",
            "flux capacitor",
            "classwork assignment",
            "pet",
            "zapper",
            "phaser",
            "space ship",
            "home world",
            "mother ship",
            "holocron",
            "wookie",
            "crystal key",
            "space pirate",
            "galactic war weapon",
            "UFO",
            "alien mummy",
            "space stuff", "unicorn"
            ,"wormhole",
            "pocket dimension",
            "quasar"
    };

    public static String[] AuxiliaryVerbs = {
            "is", "does",
            "do","did",
            "has","may", "am",

            "should",
            "could",
            "would",
            "can",
            "cant",

            "have",
            "had",
            "will",
            "are",
            "was",
            "were",
            "be",
            "being",
            "been",
            "must",
            "might",
            "shall"

    };

    public static String[] WHWords = { // the six staple words in a followup question
            "who", "what", "when", "where", "why", "how"
    };

    public static String or = "or";

    public static String[] posToNeg = { //turns a positive sentence to negative
            "n't", "not", "cant"
    };

    public static String[]  iYouNouns = {
            "nobodys","i", "they","he", "she", "we", "you all", "y'all", //"you", //"something",



            "my",
            "another",

            "your",
            "our",
            "someones",
            "somebody's",//- somebody’s

            "his",
            "their",
            "the",
            "her",
            "all",

            // - something’s

    };

    public static Map<String, String> wordPairs() {
        Map<String, String> questionPairs = new HashMap<>();
        questionPairs.put("you", "I");
        questionPairs.put("i", "you");
        questionPairs.put("she", "she");
        questionPairs.put("we", "you all");
        questionPairs.put("y'all", "we");
        questionPairs.put("yall", "we");
        questionPairs.put("she", "she");
        questionPairs.put("she", "she");
        questionPairs.put("we", "y'all");
        questionPairs.put("we", "yall");
        questionPairs.put("her", "she");
        questionPairs.put("am", "are");
        questionPairs.put("my", "your");
        questionPairs.put("your", "my");
        questionPairs.put("anybody", "somebody");

        return questionPairs;
    }

    public static String getWord(Map<String, String> map , String word) {
        return map.get(word);
    }

    public static String[]YesOrNo = {
            "yes",
            "oh yea",
            "you bet your sweet potatoes" ,
            "of course",
            "you know full well",
            "yea",
            "definitely",

    };

    public static String[] alienSynonyms = {

            "aliens",
            "space walkers",
            "invaders",
            "ancient alien architects",
            "green people",
            "monsters",
            "extraterrestrials" ,
            "ET's",
            "Martians",
            "gem monsters",
            "space warriors",
            "space monkeys",
            "the Pharoh aliens",
            "the Mayan aliens",
            "the Aztec aliens",
            "the government"

    };

    public static String[] pastTenseVerbs = {
            "rose"	,
            "awoke "	,
            "bore"	,
            "beat"	,
            "bent"	,
            "bounded"	,
            "bit"	,
            "bled on"	,
            "blew" ,
            "broke",
            "brought"	,
            "broadcast"	,
            "built"	,
            "burnt/burned"	,
            "burst"	,
            "bought",
            "casted"	,
            "caught",
            "chose"	,
            "clung on to"	,
            "came on",
            "cost"	,
            "crept on"	,
            "cut"	,
            "dealt"	,
            "dug"	,
            "dove through"	,
            "drew"	,
            "dreamt"	,
            "drank"	,
            "drove"	,
            "ate"	,
            "fell"	,
            "fed"	,
            "felt"	,
            "fought"	,
            "found"	,
            "fit"	,
            "fled"	,
            "flung"	,
            "flew"	,
            "forbade using"	,
            "forgot"	,
            "forgave"	,
            "foretold about"	,
            "froze"	,

            "gave away"	,
            "went through"	,
            "grounded"	,
            "grew"	,
            "hung"	,
            "heard of"	,
            "hid"	,
            "hit"	,
            "held"	,
            "hurt"	,
            "kept"	,
            "knelt",
            "knew of"	,
            "laid"	,
            "led "	,
            "leant on"	,
            "leapt on"	,
            "left"	,
            "lit"	,
            "lost"	,
            "made"	,
            "meant"	,
            "met"	,
            "misplaced",
            "mistook"	,
            "mowed"	,
            "overcame"	,
            "overdid"	,
            "overtook"	,
            "overthrew"	,
            "paid"	,
            "pleaded for"	,
            "probed between",
            "probed through",
            "probed through",
            "probed",
            "probed",
            "probed",
            "probed",
            "probed",
            "probed",
            "probed",
            "probed",
            "probed",
            "probed",
            "read"	,
            "got rid of",
            "rose"	,
            "ran"
    };
    public static String[] messageID ={
            "@3a82f6ef",
            "@100fc185",
            "@643b1d11"
            ,"@2ef5e5e3"
            ,"@36d4b5c",
            "@6d00a15d",
            "@51efea79",
            "@5034c75a",
            "@396a51ab",
            "@51081592"
            , "@7f9a81e8"
            , "@9629756",
            "@62ee68d8",
            "@735b5592",
            "@58651fd0",
            "@4520ebad",
            "@5419f379"
            , "@7dc7cbad"
            , "@d2cc05a",
            "@4f933fd1",
            "@548a9f61",
            "@1753acfe",
            "@7c16905e",
            "@2a2d45ba",
            "@2a5ca609",
            "@20e2cbe0",
            "@68be2bc2",
            "@28feb3fa",
            "@675d3402",
            "@51565ec2",
            "@482f8f11",
            "@1593948d",
            "@1b604f19",
            "@7823a2f9",
            "@4cc0edeb",
            "@457e2f02",
            "@5c7fa833",
            "@39aeed2f",
            "@724af044",
            "@4678c730",
            "@6767c1fc"
            , "@29ee9faa"
            , "@c038203"
            , "@cc285f4"
            , "@55f3ddb1"
            , "@8bd1b6a"
            , "@18be83e"
            , "@cb5822",
            "@4b9e13df",
            "@2b98378d",
            "@475530b9",
            "@1d057a39",
            "@26be92ad",
            "@4c70fda8",
            "@224edc67",
            "@14acaea5"
            , "@46d56d67"
            , "@d8355a8",
            "@59fa1d9b",
            "@28d25987",
            "@4501b7af",
            "@523884b2",
            "@5b275dab",
            "@61832929",
            "@29774679",
            "@3ffc5af1",
            "@5e5792a0",
            "@26653222",
            "@3532ec19"
            , "@68c4039c", "@ae45eb6"
            , "@59f99ea",
            "@27efef64",
            "@6f7fd0e6",
            "@47c62251",
            "@3e6fa38a",
            "@66a3ffec"
            , "@77caeb3e"
            , "@1e88b3c",
            "@42d80b78",
            "@3bfdc050",
            "@1bce4f0a",
            "@5e3a8624"
            , "@5c3bd550"
            , "@91161c7",
            "@604ed9f0",
            "@6a4f787b",
            "@685cb137",
            "@6a41eaa2",
            "@7cd62f43",
            "@6d4b1c02"
            , "@6093dd95"
            , "@5622fdf",
            "@4883b407"
            , "@7d9d1a19"
            , "@39c0f4a",
            "@1794d431",
            "@42e26948", "@57baeedf", "@343f4d3d"
    };

    public  static String[] names = {
    "<@U239PLW5S>",
     "<@U239VP45D>",
    "<@U23BNTWK0> ",
            "<@U239SFVB2>",
            "<@U238CFFLK>" ,"<@U239QHL3Y>" ,"<@U239ZHYET>" ,"<@U23AETT50>" ,"<@U238CE73M>" ,
"<@U23KQ9EVB>" ,
"<@U23DLBXSN>" ,"<@U23CTKZQR>" ,"<@U23CRA0BZ>" ,
"<@U23CZAXQS>"
};
//    public static String[] nouns = {
//



   // public static String[]

}
