package com.pbo;

public class ForLoop {
    public static void main (String[] args){

        System.out.println("ini adalah awal program");

        System.out.println("loop pertama");

        for(int nilai = 0; nilai <= 5 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }


        System.out.println("loop kedua");

        for(int nilai = 0; nilai <= 5 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop ketiga");

        for(int nilai = 7; nilai >= 4 ; nilai--){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop keempat");

        int nilai = 3;

        for(; nilai < 5 ;){

            System.out.println("for loop ke-" + nilai);
            nilai++;
        }

        System.out.println("ini adalah akhir program");

    }
}
