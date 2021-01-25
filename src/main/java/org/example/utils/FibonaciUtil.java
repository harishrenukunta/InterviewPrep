package org.example.utils;

public class FibonaciUtil {

    public static void testFibonaciUtils(int fibNo){
        System.out.print("\n");
        for(int i=1; i <= fibNo; i++){
            //System.out.print(FibonaciUtil.getFibonaciForNo(i) + " ");
            System.out.print(FibonaciUtil.getRecursiveFibonaci(i) +  " ");
        }
    }

    public static int getFibonaciForNo(int no){

        if(no == 1 || no == 2){
            return 1;
        }
        int fib1 = 1;
        int fib2 = 1;
        int fibResult=0;
        for(int iCounter = 3; iCounter <= no; iCounter++){
            fibResult = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibResult;
        }
        return fibResult;

    }

    public static int getRecursiveFibonaci(int fibNo){
        if(fibNo == 1 || fibNo == 2){
            return 1;
        }
        return getRecursiveFibonaci(fibNo - 1) + getRecursiveFibonaci(fibNo -2);
    }
}
