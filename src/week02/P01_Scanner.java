package week02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ad soyad yaş mail adresi şifre bilgilerini al
        sisteme kaydedildiğini aşağıdaki formatta yazdır

        Adınız=Tarık
        Soyadınız=Yiğit
        Yaşınız=42
        Mail adresiniz=tarik@yiğit.com
        Şifreniz:A2e365
        şeklinde sistemimize kayıt başarıyla tamamlanmıştır
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String isim = scan.nextLine();

        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("Lütfen e posta adresinizi giriniz");
        String mail = scan.next();

        System.out.println("Lütfen bir şifre giriniz");
        String sifre = scan.next();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yaşınız : " + yas);
        System.out.println("Mail adresiniz : " + mail);
        System.out.println("şifreniz : " + sifre);
        System.out.println("Sistemimize başarıyla kaydedilmiştir");
        System.out.println("=================SORU BİTT===================");


        /*
        Yukarıda aldığımız bilgieri
        Kullanıcı:T.Yiğit , 42
        şeklinde yazdırın
         */

     System.out.println("Kullanıcı :" + isim.charAt(0) + " . " + soyisim + " , " + yas);
        //T.Yiğit , 42


        /*
        Kullanıcıdan üçkenin kenarını ve o kenarın yüksekliğini isteyerek
        üçkenin alanını hesaplayıp yazdırın
         */

        int a = 100, h = 120;

        System.out.println("Üçgenin alanı : " + (a * h / 2));


        /*
        Kullanıcıdan iki sayi alıp üçüncü bir değiken kullanmadan
        sayi değerini değiştirin (swap)
         */

        System.out.println("Lütfen iki adet sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("1. Sayi olarak : "+ sayi1 + "girdinz" +
                          "\n 2. sayi olarak : "+ sayi2+ "girdiniz.");

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Sayi -1 "+ sayi1 + "\nSayi -2"+ sayi2);



        }


    }

 /*
 git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/GayeOZISIKLIYILMAZ/Java-Practice.git
git push -u origin main

  */