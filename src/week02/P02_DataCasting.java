package week02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {

        /*
        1- Int olarak verilen 3 sayının toplamını double olarak yazınız
         */
//
      //  int a = 3, b = 9, c = 7
      //  double toplam = (a + b + c);
      //  System.out.println("toplam " + toplam);//19.


        /*
        2- Kullanıcdan bir harf girmesini isteyiniz.
        O harften sonra gelen harfleri
        Girdiğiniz harf :
        Girdiğiniz harften sonraki  3 harf :
         şeklinde yazdrın.
          ipucu: char
         */

        Scanner scan = new Scanner(System.in);
     //System.out.print("Lütfen bir half giriniz");
     //char half = scan.next().charAt(0)
     //System.out.println("Girdiğimiz half : " + half);
     //System.out.println("Girdiğiniz harften sonraki 3 harf : " + (char) (half + 1)
     //        + "," +
     //        " " + (char) (half + 2) + ", " + (char) (half + 3) + "'dir");




        /*
        3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
            sonucu tam sayı yazdırın
            ipucu: sorumluluk bende
          */

        System.out.println("Lütfen 2 tane ondalıklı sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        double toplam=(int)(sayi1/sayi2);
        System.out.println(toplam);



    }
}
