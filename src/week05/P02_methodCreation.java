package week05;

import java.util.Scanner;

public class P02_methodCreation {
    static String duzenliStr="";
    public static void main(String[] args) {


        //Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler
        // kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String name=scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz");
        String surname=scan.nextLine();

        System.out.println(isimSoyisimYazdir(name,surname));

    }

    private static String isimSoyisimYazdir(String name, String surname) {

        name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();

        duzenliStr=name+" "+surname;
        return duzenliStr;

    }
}
