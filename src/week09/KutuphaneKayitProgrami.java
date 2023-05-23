package week09;

import java.util.ArrayList;
import java.util.Scanner;

public class KutuphaneKayitProgrami {

    //Kitap Sınıfı
    static class Kitap {
        String ad;

        String yazarinAdi;

        String yayinEvi;

        int yayinYili;

        //Kitap nesnesi methodu
        public Kitap(String ad, String yazarinAdi, String yayinEvi, int yayinYili) {

            this.ad = ad;
            this.yazarinAdi = yazarinAdi;
            this.yayinYili = yayinYili;
            this.yayinEvi = yayinEvi;

        }
        //kitap özelliklerini yazdıran method

        public void kitapYazdir() {
            System.out.println("Kitap adı:" + ad);
            System.out.println("Yazar adi :" + yazarinAdi);
            System.out.println("Yayinevi" + yayinEvi);
            System.out.println("Kitabın baskı yılı :" + yayinYili);


        }

        public static void main(String[] args) {

            ArrayList<Kitap> kutuphane = new ArrayList<>();
            Scanner scan = new Scanner(System.in);

            //Kütühane giriş menüsü
            System.out.println("Kütüphane Kayit Sistemi");
            System.out.println("------------------------");
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1-Kitap Ekle");
            System.out.println("2-Kitapları Listele");
            System.out.println("3-Sistemden Çık");

            int seçim = 0;
            while (seçim != 3) {


                System.out.print("Seçiminiz : ");
                seçim = scan.nextInt();

                switch (seçim) {
                    case 1:
                        System.out.print("Kitap Adı:");
                        String add = scan.nextLine();
                        System.out.print("Yazar adi :");
                        String yazar = scan.nextLine();
                        System.out.println("Yayın evi adı : ");
                        String yayinEvi = scan.nextLine();
                        System.out.println("Kitap baskı yılı :");
                        int yayinYılı = scan.nextInt();

                        //girilen bilgileri küyüphane listesine ekleyelim

                        Kitap kitap = new Kitap(add, yazar, yayinEvi, yayinYılı);
                        kutuphane.add(kitap);
                        System.out.println("Kitap başarıyla eklendi");

                        break;

                    case 2 :

                        System.out.println("Kütüphaneye eklenmiş kiyaplar Listesi");
                        System.out.println("-------------------------------");

                        for (Kitap k:kutuphane ){
                            k.kitapYazdir();
                            System.out.println("---------------");
                        }
                        break;

                    case 3:
                        System.out.println("Programdan çıkış yapılıyor");
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız Tekrar deneyin");


                }

            }
            scan.close();


        }
    }

}