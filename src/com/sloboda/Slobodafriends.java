package com.sloboda;

import java.util.Random;

public class Slobodafriends {

    public int people(int n, int s) {
        int[] bufArray;
        int[] colsArray = new int[n];
        int rows;
        int bufResult = 0;
        for (int i = 0; i < n; i++) {
            bufArray = getArr(n, 2, 0);
            rows = 0;
            for (int j = 0; j < n; j++) {
                if (bufArray[j] == 1) {
                    rows += 1;
                    colsArray[j] += 1;
                }
            }
            if (rows == s) bufResult += 1;
        }
        for (int i : colsArray) {
            if (i == s) bufResult += 1;
        }
        return bufResult;
    }

    private int[] getArr(int numElementArray, int maxRandomElem, int minRandomElem) {
        int[] arr = new int[numElementArray];
        Random r = new Random();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(maxRandomElem) - minRandomElem;
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        return arr;
    }
}
