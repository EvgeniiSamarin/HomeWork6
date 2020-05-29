package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,6,778,667,565,654,654,6,546,45,654,};
        System.out.println(Arrays.toString(MergeSort.mergeSort(array, 0, array.length)));
        int[] array1 = new int[]{1,6,778,667,565,654,654,6,546,45,654,65,65,56,6,56,5,767,6,75,56,435,345,43,534,545,656,76,57,54};
        System.out.println(Arrays.toString(MergeSort.mergeSort(array1, 0, array1.length)));
        int [] array2 = new int[] {43,43,43,44,54,654,6,54,3543,54,7654,5,3425,346,54,643,54324,554,6,43};
        new MergeSortNoRecursion().mergeSortNoRecursion(array2);
        System.out.println(Arrays.toString(array2));
        int [] array3 = new int[] {43,43,43,44,54,654,6,54,3543,54,7654,5,3425,346,54,643,54324,554,6,43,89768,768,768,678,768,76,756,654,767,8,35,32,423,554,765,876,8976};
        new MergeSortNoRecursion().mergeSortNoRecursion(array3);
        System.out.println(Arrays.toString(array3));
        System.out.println("Enter 2 number to multiply");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] strings = string.split(" ");
        int k =  KaratsubaAlgorithm.multiply(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
        System.out.print(" = " + k);
        System.out.println();
    }
}
