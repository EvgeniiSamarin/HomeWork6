package com.company;

public class MergeSortNoRecursion {
    public void mergeSortNoRecursion(int[] array) {

        int[] aux = new int[array.length];
        for (int i = 1; i < array.length; i *= 2) {
            for (int j = 0; j < array.length; j += 2 * i)
                arrayMerger(array, aux, j, j + i, j + 2 * i);
        }
    }

    public void arrayMerger(int [] array,  int [] aux,  int left, int median, int right) {
        if (median >= array.length){
            return;
        }
        if (right > array.length){
            right = array.length;
        }

        int i = left;
        int j = median;
        for (int k = left; k < right; k++) {
            if (i == median){
                aux[k] = array[j++];
            }
            else if (j == right){
                aux[k] = array[i++];
            }
            else if (array[j] < array[i]){
                aux[k] = array[j++];
            }
            else {
                aux[k] = array[i++];
            }
        }
        // copy back
        for (int k = left; k < right; k++){
            array[k] = aux[k];
        }
    }
}
