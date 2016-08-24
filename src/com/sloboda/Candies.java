package com.sloboda;

public class Candies {
    /*The method returns the number of possible gifts*/
    public int gifts(int x, int y, int z, int w) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                for (int n = 0; n <= z; n++) {
                    /*If the sum of all the elements is the sum of a gift, add 1*/
                    if ((x * i) + (y * j) + (z * n) == w) sum++;
                }
            }
        }
        return sum;
    }
}
