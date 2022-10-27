package com.example;

import java.util.Random;

/**
 * Hello world!
 */
public final class HW2 {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[5];
        Random rnd = new Random();
        for(int i=0;i < array1.length;i++){
            array1[i] = rnd.nextInt(10);
            array2[i] = rnd.nextInt(10);
        }
        printarray(array1);
        printarray(array2);
        printarray(difference(array1, array2));
        printarray(difference(array1, array3));
    }

    public static int[] difference(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length];
        if(arr1.length== arr2.length){
            for(int i=0;i<arr1.length;i++){
                result[i]=arr1[i]-arr2[i];
            }
            return result;
        } else {
            throw new RuntimeException("Массивы не равны");
        }
    }

    public static void printarray(int[] arr){
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
