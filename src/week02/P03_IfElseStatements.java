package week02;

import java.util.Locale;
import java.util.Scanner;

public class P03_IfElseStatements {
    public static void main(String[] args) {

        /*
  1-´ Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
     Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
          *** String icin equals method'unusalı kullanin
 */
      //  Scanner scan=new Scanner(System.in);
       //System.out.println("Bugun günlerden hangi gün");
       //String gun=scan.next().toLowerCase();

       //if (gun.equals("cumartesi") || gun.equals("pazar")){
       //    System.out.println("Haftasonu");
       //}
       //if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba")
       // || gun.equals("perşembe") || gun.equals("cuma")) {
       //    System.out.println("Haftaiçi");

       // }


       /*
        2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
        Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
        Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
        küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız

        Ad:
        Soyad:
        1.Vize:
        2. Vize:
        Final :
        Yıl Sonu Notu:
        Ders Durumu :
  */

       Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen 1. vize notunuzu giriniz");
        int vize1=scan.nextInt();
        System.out.println("Lütfen 2. vize notunuzu giriniz");
        int vize2=scan.nextInt();
        System.out.println("Lütfen final notunuzu giriniz");
        int finalNotu= scan.nextInt();
        int yılSonuNotu=(((vize1+vize2)/2)*40/100)+(finalNotu*60/100);

        System.out.println("Adınız: " + isim);
        System.out.println("Soyadınız " + soyisim);
        System.out.println("1. vize : "+ vize1);
        System.out.println("2. vize : " + vize2);
        System.out.println("Final notu : " + finalNotu);

        if (yılSonuNotu>=50){
            System.out.println("Geçtiniz tebrikler");

        }
        if (yılSonuNotu<50){
            System.out.println("Maalesef kaldınız");
        }






    }
}
