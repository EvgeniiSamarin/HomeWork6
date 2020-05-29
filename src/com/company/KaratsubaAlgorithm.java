package com.company;

import java.util.NoSuchElementException;

import static java.lang.StrictMath.log10;
import static java.lang.StrictMath.pow;

public class KaratsubaAlgorithm {
    public static int multiply(Integer x, Integer y) {
        if (x == null || y == null) throw new NoSuchElementException();
        if (x > 10 || y > 10) {
            int n;
            if (x > y)
                n = (int)(log10(x) + 1);
            else
                n = (int)(log10(y) + 1);
            if (n % 2 == 1) {
                n--;
            }
            int a = (int)(x / pow(10, n / 2));
            int b = x - (int)(a * pow(10, n / 2));
            int c = (int)(y / pow(10, n / 2));
            int d = y - (int)(c * pow(10, n / 2));
            int p = multiply(a, c);
            int q = multiply(b, d);
            int r = multiply(a + b, c + d) - p - q;
            return (int) (pow(10, n) * p + (pow(10, n / 2) * r) + q);
        }
        else return x * y;
    }
}
