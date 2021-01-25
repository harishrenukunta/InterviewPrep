package org.example.utils;

import java.util.Scanner;

public class IntegerUtils {

    public static void mainIntegerUtils(){
        System.out.println("Enter no.(Non Rec):");
        final Scanner scanner = new Scanner(System.in);
        final int no = scanner.nextInt();
        System.out.println(String.format("Integer:%d Palendrome:%b", no, isPalendromeNonRec(no)));

        System.out.println("Enter no. Rec:");
        int no2 = scanner.nextInt();
        System.out.println(String.format("Integer:%d Palendrome:%b", no2, isPalendromeRec(no2)));

    }

    private static boolean isPalendromeRec(int no) {
        int noOfDigitsRec = getDigitCountRec(no);
        System.out.println("Rec - Digit Count:" + noOfDigitsRec);
        int reverseNo = getReverseNoRec(no);
        System.out.println("rec - Rev no:" + reverseNo);
        return reverseNo == no;
    }

    private static int getReverseNoRec(int no) {
        if(no < 10){
            return no;
        }

        return (int) ((no % 10) * Math.pow(10,getDigitCountRec(no) - 1) + getReverseNoRec((int)(no / 10 )));
    }


    public static boolean isPalendromeNonRec(final int no){
        final int reverseNo = getNoReverseNonRec(no);
        System.out.println(String.format("Reverse no:%d", reverseNo ));
        return no==reverseNo;
    }

    private static int getNoReverseNonRec(int no) {
        int newNo=0;
        int cloneNo = no;
        int noOfDigits = getDigitCount(no);
        System.out.println(String.format("No. of digits:%d", noOfDigits));
        for(int i=noOfDigits; i > 0; i--){
            newNo += (cloneNo % 10) * Math.pow(10, i - 1);
            cloneNo = cloneNo / 10;
        }
        return newNo;
    }

    public static int getDigitCount(int no){
        int iCounter = 1;
        int cloneNo = no;
        while( cloneNo > 10){
            iCounter++;
            cloneNo = cloneNo / 10;
        }
        return iCounter;
    }

    public static int getDigitCountRec(int no){
        if(no < 10){
            return 1;
        }
        int iCounter = 1;
        return iCounter + getDigitCountRec(no / 10);
    }
}
