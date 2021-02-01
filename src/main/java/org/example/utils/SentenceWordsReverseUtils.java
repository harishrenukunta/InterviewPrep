package org.example.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class SentenceWordsReverseUtils {

    public static void mainSentenceWordsReverse(){
        final String sentence = new Scanner(System.in).nextLine();
        final String[] sentenceStrings = sentence.split("\\s+");
        System.out.println("Strings:" + sentenceStrings.toString());
        final List<String> reverseStrings = new ArrayList<>();
        for(int iCounter = sentenceStrings.length-1; iCounter >= 0; iCounter--){
            reverseStrings.add(sentenceStrings[iCounter]);
        }
        System.out.println("Reverse sentence:" + String.join(" ", reverseStrings));

    }
}
