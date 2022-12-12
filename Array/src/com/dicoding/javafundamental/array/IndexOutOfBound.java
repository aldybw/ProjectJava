package com.dicoding.javafundamental.array;

public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4};
//        System.out.println(arrA[0]);
//        System.out.println(arrA[1]);
//        System.out.println(arrA[2]);

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for (int x = 0; x < arrA.length; x++) {
            arrA[x] = x + 1;
            System.out.println(arrA[x]);
        }

        // Akses indeks ke 4
        System.out.println(arrA[4]);
    }
}
