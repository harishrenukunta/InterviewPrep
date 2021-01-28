package org.example.utils;

import java.util.Scanner;

public class ArmstrongUtils {
    public static void mainArmstrongUtils(){
        System.out.println("Enter No(non-rec):");
        final Scanner scanner = new Scanner(System.in);
        final int no = scanner.nextInt();
        System.out.println(String.format("No. '%d' is Armstrong:%b", no, isArmstrongNonRec(no)));
        System.out.println("Enter No(Rec):");
        final int no2 = scanner.nextInt();
        System.out.println(String.format("No. %d is Armstrong(Rec):%b", no2, isArmstrongRec(no2)));
    }

    private static boolean isArmstrongNonRec(int no) {
        int tempNo = no;
        int digitCount = getDigitsCount(no);
        System.out.println("Digit count:" + digitCount);
        int result = 0;
        for(int i=1; i <= digitCount; i++){
            result = result + (int)Math.pow(tempNo%10, 3);
            tempNo = tempNo / 10;
        }
        System.out.println(String.format("Org. no:%d Sum of cubes of individual digits:%d",no, result));
        return result == no;
    }

    private static int getDigitsCount(int no){
        if(no < 10){
            return 1;
        }
        return 1 + getDigitsCount(no /10);
    }

    private static boolean isArmstrongRec(final int no){
        final int armstrongNo = calcArmstrongNoRec(no);
        System.out.println("Armstrong no:" + armstrongNo);
        return armstrongNo == no;
    }

    private static int calcArmstrongNoRec(final int no){
        if(no < 10){
            return (int)Math.pow(no, 3);
        }
        return (int)Math.pow(no%10, 3) + calcArmstrongNoRec(no/10);
    }
}
