package com.company.bubblesort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheBufferedReader {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number to parse");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);

    }
}
