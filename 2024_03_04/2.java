package org.pjatk.homework.zad02;

import java.util.Scanner;

public class SimpleSummingProgram {

    /*
        Użytkownik wprowadza z klawiatury serię liczb różnych od zero,
        zero natomiast jest sygnałem zakończenia wprowadzania danych.
        Napisz program, który obliczy sumę tych liczb
     */
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int N=myObj.nextInt();
        int sum=0;

        while(N!=0)
        {
            sum += N;
            N=myObj.nextInt();
        }

        System.out.println("suma: " + sum);

    }
}
