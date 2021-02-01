package org.example.utils;

import sun.swing.text.CountingPrintable;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class DuplicateCharsInStrUtils {
    public static void mainDuplicateCharsInStr(){
        System.out.println("Enter str:");
        final String str = new Scanner(System.in).nextLine();
//        List<Character> strChars = new ArrayList<>();
//        for(Character c : str.toCharArray()){
//            strChars.add(c);
//        }
        List<Character> strChars = str.chars()
                .mapToObj( ch -> (char)ch)
                .collect(Collectors.toList());

        strChars.stream()
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet().stream()
                .filter(es -> es.getValue() > 1)
                .forEach( es -> System.out.println(es.getKey() + " : " + es.getValue()));

    }
}
