package com.mwcruz;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by mwcruz on 10/8/16.
 */
public class Hailstone {
    /**
     * Compute a hailstone sequence.
     * @param n Starting number for sequence. Assumes n > 0.
     * @return hailstone sequence starting with n and ending with 1.
     */
    public static List<Integer> hailstoneSequence(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(n);
        return list;
    }
}

