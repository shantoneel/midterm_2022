package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] split = wordGiven.split(" ");
        String lrgWord = split[0];
        int lrgLength = lrgWord.length();
        for (String word: split) {
            if (lrgLength< word.length()){
                lrgLength = word.length();
                lrgWord = word;
            }
        }

        map.put(lrgLength,lrgWord);
        System.out.println(map);


        return map;
    }
}
