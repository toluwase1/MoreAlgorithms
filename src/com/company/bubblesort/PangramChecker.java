package com.company.bubblesort;

public class PangramChecker {
    public static void main(String[] args) {
        System.out.println(check("qgukmeiwxladsno cyvrphbjtzf"));
    }
    public static boolean check(String sentence){
        String hold = sentence.toLowerCase();
        int sum = 0;

        for (char i ='a'; i <= 'z'; i++){
         if(hold.contains("" +i)){
             sum++;
         }
        }
        return sum == 26;
    }
}
