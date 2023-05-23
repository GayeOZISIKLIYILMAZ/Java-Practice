package week06;

import java.util.Scanner;

public class F01_SayiTahminOyunu {
    public static void main(String[] args) {

        //Sisteme bir sayi tanımlatıp kullanıcıdan sayi isteyerek
        //Bu sayi fazla ise çok söyledin duşur az ise düşük söyledin arttır
        //bilincede tebrik edip durdurn kod yazınız

        int sayi=94;

        Scanner scan=new Scanner(System.in);
        System.out.println("Aklımdan 0-100 arası sayi tuttum Hadi tahmin et!");

        boolean dogruMu=false;

        while (!dogruMu){

            int tahmin= scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Cok söyledin azalt");
            } else if (tahmin<sayi) {
                System.out.println("Az söyledin arttır");

            } else if (tahmin==sayi) {
                System.out.println("Tebrikler doğru bildiniz");
                dogruMu=true;

            }else {
                dogruMu=false;
            }
        }


    }
}
