package com.kattis;

import java.util.Arrays;
import java.util.Scanner;

public class QuickEstimates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nValues[] = new String[n];
        for (int i = 0; i < n; i++) {
            nValues[i] = scanner.next();
        }
        Arrays.stream(nValues).forEach(ints -> System.out.println(ints.length()));
    }
}
