package com.company;

public class Karatsuba {
    public static int karatsuba(int a, int b) {
        boolean[] aBool= translateToBool(a);
        boolean[] bBool = translateToBool(b);
        boolean res = karatsubaMultiply(aBool, aBool.length, bBool, bBool.length);
        return 0;
    }

    private static boolean[] translateToBool(int a) {
        StringBuilder s = new StringBuilder();
        while( a!= 0) {
            int b = a % 2;
            s.append(b);
            a = a/2;
        }
        boolean[] chBool = new boolean[s.length()];
        int k = 0;
        for(int i = s.length() - 1; i >=0; i--){
            char ch = s.charAt(i);
            if(ch == '1') {
                chBool[k] = true;
            } else {
                chBool[k] = false;
            }
            k++;
        }
        return chBool;
    }

    public static boolean karatsubaMultiply(boolean[] a, int aLength, boolean[] b, int bLength){
        int n = Math.max(aLength, bLength);
        if(n == 1) return a[0] && b[0];

        boolean [] aLeftSide = new boolean[a.length / 2];
        boolean [] bLeftSide = new boolean[b.length / 2];
        boolean [] aRightSide = new boolean[a.length / 2];
        boolean [] bRightSide = new boolean[b.length / 2];


        return true;
    }
}
