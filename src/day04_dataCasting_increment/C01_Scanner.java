package day04_dataCasting_increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        char ilkHarf= scan.next().charAt(0);

        System.out.println("Girdiginizin ismin ilk harfi : " + ilkHarf);


    }
}
