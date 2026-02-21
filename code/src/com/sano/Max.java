package com.sano;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,45,67,8};
        System.out.println(max(arr));
    }
    static int maxRange(int[] arr , int start , int end){
        int maxVal= arr[0];
        f