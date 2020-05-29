package com.company;

public class MergeSort {
    public static int[] mergeSort(int[] array, int left, int right){
        if (right == 0) {
            return new int[0];
        } else if (right == 1) {
            return new int[]{array[left]};
        } else if (right == 2) {
            if (array[left] < array[left + 1]) {
                return new int[]{array[left], array[left + 1]};
            } else {
                return new int[]{array[left + 1], array[left]};
            }
        } else {
            int[] leftSide = mergeSort(array, left, right / 2);
            int[] rightSide = mergeSort(array, left + (right / 2), right - (right / 2));
            return arrayMerger(leftSide, rightSide);
        }
    }
    public static int[] arrayMerger(int[] leftSide, int[] rightSide) {
        int i = 0;
        int j = 0;
        int[] result = new int[leftSide.length + rightSide.length];
        while ((i + j) < result.length) {
            if ((i < leftSide.length) && (j < rightSide.length)) {
                if (leftSide[i] < rightSide[j]) {
                    result[i + j] = leftSide[i++];
                } else if (leftSide[i] >= rightSide[j]) {
                    result[i + j] = rightSide[j++];
                }
            } else {
                if (i < leftSide.length) result[i + j] = leftSide[i++];
                else if (j < rightSide.length) result[i + j] = rightSide[j++];
            }

        }
        return result;
    }
}
