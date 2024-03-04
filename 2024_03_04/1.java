package org.pjatk.homework.zad01;
import java.util.Scanner;

public class AliceHaveCatsProgram {


    /*
        Użytkownik wprowadza z klawiatury liczbę kotów, które posiada pani Ala.
        Napisz program który poprawnie wyświetli zdanie typu 'Ala ma kota'

        np. dla liczby 1 - "Ala ma jednego kota"
            dla liczby 2 - "Ala ma 2 koty"
            dla liczby 9 - "Ala ma 9 kotów"
            dla liczby 23 - "Ala ma 23 koty"
            dla liczby 25 - "Ala ma 25 kotów"
            dla liczby 11 - "Ala ma 11 kotów"
            dla liczby 12 - "Ala ma 12 kotów"
            dla liczby 16 - "Ala ma 16 kotów"
            dla liczby 21 - "Ala ma 21 kotów"
            itd.
     */
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int N=myObj.nextInt();
        if (N==1)
            System.out.println("Ala ma jednego kota");
        else
            if (N>1 && N<5)
                System.out.println("Ala ma " + N + " koty");
            else
                if (N>=5)
                    System.out.println("Ala ma " + N + " kotów");


    }

}
