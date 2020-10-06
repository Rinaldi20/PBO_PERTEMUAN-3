package com.pbo;
import java.util.*;

public class LoginSistem {
    public static void main(String[] args) {
        boolean memutar = true;
        int counter = 0;
        String username,pasword,jawab;

        while(memutar){

            System.out.println(" SILAHKAN LOGIN DI WEBSITE UPJ");
            System.out.println("------------------------------");
            Scanner inputdata = new Scanner(System.in);

            System.out.print("masukan username = ");
            username = inputdata.next();

            System.out.print("masukan pasword = ");
            pasword = inputdata.next();


            if (username.equals("kenaroh")) {
                if (pasword.equals("ken45")) {

                    System.out.println("selamat datang di dashboard UPJ\n");
                    break;
                }

            } else {
                System.out.println("username atau pasorwd anda salah\n");

            }

             System.out.println("silahkan masukan username dan pasword kembali\n  ");
              jawab = inputdata.nextLine();

              if (jawab.equalsIgnoreCase("t")){
                  memutar = false ;
              }
                  counter++;
                  

        }
        System.out.println("anda sudah melakukan perulangan "+ counter + " kali\n");

        System.out.println("TERIMAKASIH TELAH BERKUNJUNG DI WEBSITE UPJ");
    }
}
