package com.company.bubblesort;

public class Solution {

    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for (int i = 3; i<number; i++)
        if (i%3==0 || i%5 == 0 ) {
            sum += i;
        }
return sum;
    }
}
//OR
//public class Solution {
//
//    public int solution(int number) {
//        //TODO: Code stuff here
//        int sum = 0;
//        for (int i = 3; i<number; i++) {
//            if (i%3==0 || i%5 == 0 ) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
//}