package org.example.utils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FirstNonDuplicateCharUtils {
    public static void mainUtils(){
        System.out.print("Enter str to check for non dup char:");
        final String str = new Scanner(System.in).nextLine();
        System.out.println(String.format("First non duplicate char of %s:%c", str, firstNonDupChar(str)));
    }

    private static Character firstNonDupChar(String str) {
        /*
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            Character ch = (Character)str.charAt(i);
            if(charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch) + 1);
            }else{
                charCount.put(ch, 1);
            }
        }
        */

        Map<Character,Long> charCount = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()));


        return charCount.entrySet()
                .stream()
                .filter(es -> es.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}
