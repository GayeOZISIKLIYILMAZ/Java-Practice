package week07;

import java.util.Scanner;

public class P02_doWhileLoop {

    /*
    Kullanıcıdan bir şifre girmesini isteyin şifreyi aşağıdaki
    şartlara göre kontrol edin ve hataları yazdırın
    -Şifre girildiğinde Şifreniz kabul edilmiştir yazdırın
    -Şifre küçük half içermelidir
    -Şifre büyük half içermelidir
    -Şifre özel karekter içermelidir
    -Şifre en az 8 karekter olmalıdır
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        String sifre = "";

        do {
            System.out.println("Lütfen bir şifre giriniz:");
            sifre = scan.nextLine();

            for (int i = 0; i < sifre.length(); i++) {

                if (!(sifre.charAt(i) >= 65 && sifre.charAt(i) <= 90)) {
                    System.out.println("Şifre büyük half içermelidir");
                    sayac++;
                }
                if ((sifre.charAt(i) >= 97 && sifre.charAt(i) <= 122)) {
                    System.out.println("Şifre küçük half içermelidir");
                    sayac++;
                }
                if ((sifre.charAt(i) >= 32 && sifre.charAt(i) <= 64)) {
                    System.out.println("Şifre özel karekter içermelidir");
                    sayac++;
                }
                if (sifre.length() < 8) {
                    System.out.println("Şifre en az 8 karekter olmalıdır");
                    sayac++;
                }
                break;

            }
            if (sayac==0){
                System.out.println("Şifeniz başarıyla kaydedildi");
            }

        }while (sayac!=0);

    }
}
