package com.company.bubblesort;

public class DemoExceptionHandling {
    public static void main(String[] args) {
        int i,j,k=0;
        i=8;
        j = 0;
        try {
            k=i/j; // this statement is likely to throw an error, hence has to be put in try block
        } catch (Exception e) {
            System.out.println(e+" :cannot divide by zero");;
        }
        System.out.println(k);
    }
}
