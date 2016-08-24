package com.sloboda;

public class Candies {

    public int gifts(int x, int y, int z, int w) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                for (int n = 0; n <= z; n++) {
                    if ((x * i) + (y * j) + (z * n) == w) sum++;
                }
            }
        }
        return sum;
    }
}
