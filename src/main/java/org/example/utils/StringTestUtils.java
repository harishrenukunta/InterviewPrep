package org.example.utils;

import java.util.Scanner;
import java.util.stream.IntStream;

public class StringTestUtils {

    public static void mainStringTestUtils(){
        System.out.println("Enter string:");
        final Scanner scanner = new Scanner(System.in);
        final String strToTest = scanner.nextLine();

        System.out.println(String.format("Str '%s' is palendrome:'%b'", strToTest, isPalendromeRec(strToTest)));

        System.out.println(String.format("Non Rec Str '%s' is palendrome:'%b'", strToTest, isPalendromeNonRec(strToTest)));
    }

    public static boolean isPalendromeRec(final String strToTest){
        final String strReverse = getReverse(strToTest);
        System.out.println(String.format("str:%s  Reverse:%s",strToTest, strReverse ));
        return strToTest.equalsIgnoreCase(strReverse);
    }

    public static boolean isPalendromeNonRec(final String strToTest){
        final String strReverse = getReverseNonRec(strToTest);
        return strToTest.equalsIgnoreCase(strReverse);
    }

    private static String getReverseNonRec(String strToTest) {
        final StringBuilder sb = new StringBuilder(strToTest.length());
        for(int iCounter = strToTest.length() - 1; iCounter >= 0; iCounter-- ){
            sb.append(strToTest.charAt(iCounter));
        }
        return sb.toString();
    }

    public static String getReverse(final String strToTest){
        if(strToTest == null || strToTest.isEmpty()){
            return "";
        }

        return strToTest.charAt(strToTest.length() - 1) + getReverse(strToTest.substring(0, strToTest.length()-1));
    }


}
