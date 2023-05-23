package week03;

import java.util.Scanner;

public class P07_SwichStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //Kullanicidan bir rakam alip, rakami yaziyla yazdirin

        System.out.println("Lütfen bir rakam giriniz");//9a kadar olanlar

        int rakam=scan.nextInt();

        switch (rakam){

            case 0:
                System.out.println("Sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üc");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
                case 9:
                System.out.println("Dokuz");
                break;

        }

        //Kullanicidan ay numarasini alip ay ismini yazdirin

        System.out.println("Lütfen ay numarasını giriniz");

        int ay=scan.nextInt();

        switch (ay){
            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("subat");
                break;
            case 3 :
                System.out.println("mart");
                break;
            case 4 :
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("mayıs");
                break;
            case 6 :
                System.out.println("haziran");
                break;

        }




    }
}
