package org.example.utils;

import java.util.Scanner;

public class AnagramUtils {

    public static void mainAnagramUtils(){
        System.out.print("Enter strings to check for Anagram:");
        Scanner scanner = new Scanner(System.in);
        final String str1 = scanner.nextLine();
        final String str2 = scanner.nextLine();
        System.out.println(String.format("str1:%s str2:%s Anagram:%b", str1, str2, isAnagram(str1, str2)));
    }

    private static boolean isAnagram(final String str1, final String str2){
        if(str1.length() != str2.length())
            return false;
        return str1.chars().mapToObj( ch -> (char)ch)
                .allMatch(ch -> str2.toLowerCase().contains(ch.toString().toLowerCase()));
    }
}
