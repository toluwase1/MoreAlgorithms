package com.company.bubblesort;

public class Main {

    public static void main(String[] args) {

    }

    public static String changer(String input) {
//        String a = "u";
//        String b = "you";
//        String c = "youuu";
//        String d = "your client";
        if (input.contains(" you ")) {
            input = input.replace("you", "your client");
        }
        if (input.contains(" u ")) {
            input = input.replace("u", "your client");
        }
        if (input.contains(" youuu ")) {
            input = input.replace("youuu", "your client");
        }

        return input;
        // write your code here
    }

}

