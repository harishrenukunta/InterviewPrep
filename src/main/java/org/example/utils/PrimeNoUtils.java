package org.example.utils;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


public class PrimeNoUtils {

    public static void  testPrimeUtils(final int no){
        //System.out.println(String.format("No '%s' is prime '%s'", no, checkPrime(no)));
        List<Integer> lisOfPrimes = FindPrimesIn(no);
        System.out.println(lisOfPrimes);
    }

    public static List<Integer> FindPrimesIn(int no){
        return IntStream.rangeClosed(1, no)
                .filter(PrimeNoUtils::checkPrime)
                .boxed()
                .collect(toList());
    }

    public static boolean checkPrime(final int no){
        if(no == 1 || no == 2 || no == 3)
            return true;

        if(no % 2 == 0)
            return false;

        int increment = 2;

        int sqrtNo = (int)Math.sqrt(no);

        return !IntStream.rangeClosed(5, sqrtNo)
                .anyMatch( i -> no % i ==0);

//        for(int iCounter=3; iCounter <= sqrtNo; iCounter=iCounter + 2){
//            if(no % iCounter == 0)
//                return false;
//        }
 //       return true;
    }
}
