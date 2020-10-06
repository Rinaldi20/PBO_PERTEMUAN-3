package com.pbo;

public class WhileLoop {
    public static void main (String[] args){

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 9){
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");

    }
}
