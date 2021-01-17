package com.company.bubblesort;

import java.util.*;

public class PerfectPower3 {
    public static int[] isPerfectPower(int n) {
        int logOfN = (int) Math.ceil(Math.log(n)/Math.log(2));

        for (int m = 2; m <= n/m; m++) {
            for (int k = 2; k <= logOfN; k++) {
                if (n%m == 0 && Math.pow(m, k) == n) {
                    return new int[] {m, k};
                }
            }
        }
        return null;
    }
}