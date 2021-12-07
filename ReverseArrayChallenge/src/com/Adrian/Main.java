package com.Adrian;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
	int[] array = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    private static void reverse(int[] array) {
        for (int i = 0; i < array.length-1-i; i++) {
            int temp = array[i];
            array[i] = array[(array.length -1)-i];
            array[(array.length -1)-i] = temp;
        }
    }
}
