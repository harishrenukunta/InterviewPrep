package org.example.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class RemovingDuplicateUtils {

    public static void mainRemoveDuplicateWords(){
        List<String> words = Arrays.asList(new String[]{"Geeks", "are", "not", "going", "are", "not", "Geeks"});
        displayList(words);
        List<String> distinctWords = words.stream()
                                        .collect(groupingBy(Function.identity(), counting()))
                                        .entrySet().stream()
                                        .filter( entryItem -> entryItem.getValue() == 1)
                                        .map(Map.Entry::getKey)
                                        .collect(toList());
        displayList(distinctWords);

    }
    public static void displayList(final List<String> listOfWords){
        System.out.println("list strings:" + String.join(" ", listOfWords));
    }
}
