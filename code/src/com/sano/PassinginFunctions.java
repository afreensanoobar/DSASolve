package com.sano;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums ={3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    // it changes the original value becoz ARRAYS ARE MUTABLE ANS STRINGS ARE NOT
    static void change (int[] arr){
        arr [0] = 99;
    }
}
