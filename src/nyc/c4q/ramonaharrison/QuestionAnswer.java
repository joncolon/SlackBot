package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.network.Slack;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by hakeemsackes-bramble on 9/11/16.
 */
public class QuestionAnswer {
    private static Object ArrayList;

    public static void main(String[] args) {
        System.out.println(explainingSentencePT(WordLists.pastTenseVerbs)+"s");
    }

    public static String responseGenerator(String queston) {
        String lowQuestion = queston.toLowerCase();
        // first check for the question type. the question types are done
        // yes no questions done
        // choice questions done
        // follow up/question-word questions questions ex: how, yes or no questions?

        // boolean scenario questions

        ////the the answers will be simple yet relevant to the question asked

        List<String> questionList = Arrays.asList(lowQuestion.split(" "));

        if (wordChecker(questionList, WordLists.WHWords)) {
            return "it works";
        } else {
            return questionList.get(0);
        }
    }

    //QUESTION CHECKER METHOD:
    public static String QuestionTypeChecker(String question) {

        String statements = question.toLowerCase();
        List<String> statement = Arrays.asList(statements.split(" "));

        boolean isYesOrNo = checkWordType(statement, WordLists.AuxiliaryVerbs, 0) && !WordinSentence(statement, "or");
        // if it {starts With AuxVerb or verb "} and there is one noun, {no "or"}   // response Yes or No --rest of sentence-- because aliens

        boolean isChoiceQuestion = checkWordType(statement, WordLists.AuxiliaryVerbs, 0) && WordinSentence(statement, "or"); //true that sentence has or;
        //if it {starts with an auxiliary verb or verb "be"} and there is n + 1// nouns, for every "or" or comma

        boolean isFollowupQuestion;
        // if Q words start sentence and then follows with auxiliary verb "is yes or no Question"
        //if else case for each Q word

        boolean isWquestionWordQuestion = checkWordType(statement, WordLists.WHWords, 0) && checkWordType(statement, WordLists.AuxiliaryVerbs, 1);
        // if question words (who what when where when why how) start the sentence

        boolean IsInterrogativestatement; //check for if it's a question: if all of the above are NOT NEEDED




        if (isChoiceQuestion) {
            return "choice question answer";
        } else if (isYesOrNo) {
            return YesOrNoAnswer(statement);
        }else if (isWquestionWordQuestion) {
            if (statement.get(0).equals("who")) {
                return "who answer";

            } else if (statement.get(0).equals("how")) {
                return howAnswer(statement); // how did you do that ---- i did that by aliens ate my homework

            } else if (statement.get(0).equals("when")) {
                return "when answer";

            } else if (statement.get(0).equals("what")) {
                return whatAnswer(statement);


            } else if (statement.get(0).equals("where")) {
                return "where answer";

            } else if (statement.get(0).equals("why")) {
                return whyAnswer(statement);
            }
            return "is QW question";
        }
        return "I dont believe it!!" + explainingSentencePT(WordLists.pastTenseVerbs) + "!!!";
    }

    //METHOD THAT RETURNS A SENTANCE
    // public static String responseMaker(String sentence){
    // List<String> sentenceList = Arrays.asList(sentence.split(" "));
    // String questinType = QuestionTypeChecker(sentenceList);
    // String newsentance = "";


    //return "hi";
    // }







    public static String YesOrNoAnswer(List<String> sentence) {
        Random index = new Random();
        int yesword = index.nextInt(WordLists.YesOrNo.length);
        String phrase =" " + WordLists.YesOrNo[yesword];
        String phrase1 = responseToQuestion(sentence);
        return phrase + phrase1 + ". I know that because "+ explainingSentencePT(WordLists.pastTenseVerbs) +".";
    }
    public static String howAnswer(List<String> sentence){

        String phrase1 = responseToQuestion(sentence);

        return phrase1 + "?"+" by using " + explainingSentencePT(WordLists.pastTenseVerbs) + "s.";
    }
    public static String whyAnswer(List<String> sentence){
           Random index = new Random();
           int yesword = index.nextInt(WordLists.YesOrNo.length);
//            String phrase = WordLists.YesOrNo[yesword] + " ";
            String phrase1 = responseToQuestion(sentence);
            return phrase1 + " because "+ explainingSentencePT(WordLists.pastTenseVerbs)+"s. "+ WordLists.YesOrNo[yesword] +" it's true.";
        }

    public static String whatAnswer(List<String> sentence){
//            Random index = new Random();
//            int yesword = index.nextInt(WordLists.YesOrNo.length);
//            String phrase = WordLists.YesOrNo[yesword] + " ";
        String phrase1 = responseToQuestion(sentence) ;
        return "hmm..." + phrase1 + " due to "+ explainingSentencePT(WordLists.pastTenseVerbs);
    }



    public static String responseToQuestion(List<String> sentenc) {
        int start = 0;
        List<String> sentence = sentenc;
        if (checkWordType(sentence, WordLists.AuxiliaryVerbs, 0)&& !checkWordType(sentence, WordLists.AuxiliaryVerbs, 1)){
            start = -1;
        }else{
            sentence = sentenc.subList(1,sentenc.size());
        }
        String phrase1 = "";
        for ( int i = start ; i < sentence.size(); i++) {
            int j = Math.abs(i);
            String words = sentence.get(j);
            if (WordinSet(WordLists.wordPairs().keySet(), words)) {
                phrase1 += " " + WordLists.getWord(WordLists.wordPairs(), words) ;
            } else {
                phrase1 +=  " " + words;
            }
            if (i == 0 && start == -1) {
                i++;
            }
        }
        return phrase1 ;
    }
    public static  String explainingSentencePT(String[] verbTense){

        Random index = new Random();
        int alienword = index.nextInt(WordLists.alienSynonyms.length);
        int Verb = index.nextInt(verbTense.length);
        int iYouword = index.nextInt(WordLists.iYouNouns.length-6) + 6;
        int noun = index.nextInt(WordLists.nouns.length);
        String noNoun = "";
        String newSentance =  WordLists.alienSynonyms[alienword] + " "
                +  verbTense[Verb] + " " + WordLists.iYouNouns[iYouword] + " ";

        if(iYouword < 8){
            newSentance += ("with " + WordLists.nouns[noun]);
        }else if(WordLists.iYouNouns[iYouword].equals("something")){
                newSentance += noNoun;
        }else {
            newSentance += WordLists.nouns[noun];
        }

        return newSentance;
    }

   //public static String
   //aliens ate my dinner
    // method that checks if a word type is in the sentence

    public static boolean wordChecker(List<String> statement, String[] list) {

        int inputLen = statement.size();
        int wordListLen = list.length;
        boolean hasWord = false;
        for (int i = 0; i < inputLen; i++) {
            String wordInput = statement.get(i);
            for (int j = 0; j < wordListLen; j++) {
                char c;
                if (wordInput.equals(list[j])) {
                    hasWord = true;
                    break;
                }
            }
        }
        return hasWord;
    }

    //method that checks if a specific word type is in specific part of a sentence

    public static boolean checkWordType(List<String> sentence, String[] wordList, int index) {
        String word = sentence.get(index);
        boolean isWordtype = false;  // assume word isn't there
        for (String wordType : wordList) {
            if (word.equals(wordType)) {
                isWordtype = true;   //return true if word is in list
                break;
            }

        }
        return isWordtype;
    }

    //method that checks for a specific word in sentence
    public static boolean WordinSentence(List<String> sentence, String wordToLookFor) {
        //String word = word;
        boolean isWordType = false;  // assume word isn't there
        for (String words : sentence) {
            if (words.equals(wordToLookFor)) {
                isWordType = true;   //return true if word is in sentence
                break;
            }

        }
        return isWordType;
    }
    public static boolean WordinSet(Set<String> sentence, String wordToLookFor) {
        //String word = word;
        boolean isWordType = false;  // assume word isn't there
        for (String words : sentence) {
            if (words.equals(wordToLookFor)) {
                isWordType = true;   //return true if word is in sentence
                break;
            }

        }
        return isWordType;
    }



}



