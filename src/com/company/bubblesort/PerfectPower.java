package com.company.bubblesort;
import java.util.*;
public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        for (int i = 2; i * i <= n; i++) {
            int power = temp(n, i);
            if (Math.pow(i, power) == n) return new int[]{i, power};
        }
        return null;
    }


    public static int temp(int k, int j) {


        int power = 0;
        int fac = k / j;
        if (k % j ==0) power = temp(fac, j) + 1;
        if (fac == 1) return 1;
        return power;
    }
}







//public class PerfectPower {
//    public static Double isPerfectPower(int n) {
//        // ...
//        boolean result1 = Math.sqrt(n)%2==0;
//        boolean result2 = Math.cbrt(n)%2==0;
//        //boolean result3 = Math.fo
//        if (result1) {
//            return Math.sqrt(n) + 2;
//        } else if (result2) {
//            return Math.sqrt(n) + 3;
//        } else {
//            return null;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPerfectPower(27));
//    }
//
//}