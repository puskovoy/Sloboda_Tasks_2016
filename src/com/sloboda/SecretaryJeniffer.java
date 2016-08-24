package com.sloboda;

public class SecretaryJeniffer {
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

    private boolean time(int t, int n, int x, int y) {
        return t / x + (t - x) / y >= n;
    }
}
