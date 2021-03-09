package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] array1 = {{2, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2, 4}, {3,1,0}, {4, 5, 6}};
        //Main.print(array1);
        System.out.println();
        // Main.print(array2);
        int [][] product= Main.productoftwomatrix(array1,array2);
        Main.print(product);



    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] productoftwomatrix(int [][] array1 ,int[][] array2 ){
        int[][] arrayproduct=new int[array1.length][array2[0].length];

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                for (int k=0;k<array2[0].length;k++){
                    arrayproduct[i][k]+=array1[i][j]*array2[j][k];

                }

            }
        }

        return  arrayproduct;
    }



}
