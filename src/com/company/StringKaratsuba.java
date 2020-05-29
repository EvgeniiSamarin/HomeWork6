package com.company;

public class StringKaratsuba {

    public static int makeEqualsLength(String first, String second) {
        int length1 = first.length();
        int length2 = second.length();
        if ( length1 < length2) {
            for (int i = 0; i < length2 - length1; i++) {
                first = "0" + first;
                return length2;
            }
        } else if( length1 > length2) {
            for(int i = 0; i < length1 - length2; i++) {
                second = "0" + second;
            }
        }

        return length1;

    }

    public static String addString(String first, String second) {
        String result = ""; // Хранение суммы битов

        int length = makeEqualsLength(first, second);

        int carryBit = 0;

        for (int i = length - 1; i >= 0; i-- ) {
            int firstBit = first.charAt(i);
            int secondBit = second.charAt(i);

            int sum = (firstBit ^ secondBit ^ carryBit) + '0';

            result = (char) sum + result;

            carryBit = (firstBit&secondBit)|(secondBit&carryBit)|(firstBit&carryBit);
        }

        if(carryBit != 0) {
            result = '1' + result;

        }

        return result;
    }

    public static int multiplySingleBit(String a, String b) {

        return (a.charAt(0) - '0')*(b.charAt(0) - '0');
    }

    public static long multiply(String a, String b) {
        int n = makeEqualsLength(a, b);
        if(n == 0) return  0;

        if(n == 1) return multiplySingleBit(a, b);

        int fh = n/2;
        int sh = n - fh;

        String aLeft = a.substring(0, fh);
        String aRight = a.substring(fh, sh);

        String bLeft = b.substring(0, fh);
        String bRight = b.substring(fh, sh);

        long p1 = multiply(aLeft, bLeft);
        long p2 = multiply(aRight, bRight);

        long p3 = multiply(addString(aLeft, aRight), addString(bLeft, bRight));

        return p1 * (1 << (2 * sh)) + (p3 - p1 - p2) * (1 << sh) + p2;
    }


    public static void main(String[] args) {
        System.out.println(multiply("111", "111"));
    }
}
