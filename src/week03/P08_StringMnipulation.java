package week03;

import java.util.Scanner;

public class P08_StringMnipulation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

   //Kullanicidan isim ve soyismini ayri ayri alin.
   //ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
   //yazdirin soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
   //harflerle yazdirin

        System.out.println("Lütfen isminizi giriniz");
        String name=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String surname=scan.nextLine();

      if (name.length()>surname.length()){
          name=name.substring(0,1).toUpperCase()+name.substring(1,name.length());
          surname=surname.substring(0,1).toUpperCase()
                  +name.substring(1,surname.length());
          System.out.println(name+" "+surname);

      }

      }


    public static class P01_soru {
    }
}

