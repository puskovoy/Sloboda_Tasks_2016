package com.sloboda;

public class SecretaryJeniffer {
    /*method returns the minimum time in seconds required for the preparation of N copies.*/
    public int timeCopies(int n, int x, int y) {
        int r = 1;
        while (!time(r, n, x, y)) {
            r *= 2;
        }
        int l = r / 2;

        while (r - l > 1) {
            int m = (l + r) / 2;
            if (!time(m, n, x, y)) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }
    /*The first print copier (t / x) of copies, and the second - (t - x) / y.*/
    private boolean time(int t, int n, int x, int y) {
        return t / x + (t - x) / y >= n;
    }
}
