package org.example.utils;

import java.util.Scanner;

public class GCDUtils {

    public static void mainGCDUtils(){
        System.out.print("Enter no1:");
        final Scanner scanner = new Scanner(System.in);
        final int no1 = scanner.nextInt();

        System.out.print("Enter no2:");
        final int no2 = scanner.nextInt();

        //int gcd = findGCDNonRec(no1, no2);
        int gcd = findGCDRec(no1, no2);
        System.out.println(String.format("GCD of %d and %d is %d", no1, no2, gcd));


    }

    public static int findGCDRec(int no1, int no2){
        if(no2 == 0){
            return no1;
        }

        return findGCDRec(no2, no1%no2);
    }

    public static int findGCDNonRec(int no1, int no2){
        int divisor, no;
        if(no1 > no2){
            no = no1;
            divisor = no2;
        }else{
            no = no2;
            divisor = no1;
        }

        int remainder;
        do{
            remainder = no % divisor;
            if(remainder != 0 && remainder < divisor) {
                no = divisor;
                divisor = remainder;
            }
        } while(remainder != 0 && divisor < no );
        return remainder;

    }
}
