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
        double[] array1 = new double[10];
        double[] array2 = new double[10];
        double[] array3 = new double[5];
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

    public static double[] difference(double[] arr1,double[] arr2){
        double[] result = new double[arr1.length];
        if(arr1.length== arr2.length){
            for(int i=0;i<arr1.length;i++){
                result[i]=arr1[i]/arr2[i];
            }
            return result;
        } else {
            throw new RuntimeException("Массивы не равны");
        }
    }

    public static void printarray(double[] array1){
        for (double i : array1) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
