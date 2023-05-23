package week06;

import java.util.Scanner;

public class F02_WiseMarket {
    static Scanner scan=new Scanner(System.in);
    static String urunAdi;
    static String sepet="";
    static int urunKodu;
    static int urunFiyati;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun=false;

    public static void main(String[] args) {

        /*
        =================PROJEMİZ==================
        İlk programa girdiginde bizi bir menü karsılasın bu secenekler
        1-ŞARKÜTERİ SEÇENEĞİ
        2-MANAV ÜRÜNLERİ
        3-MARKET
        seçime göre
        4-Ürünleri listele ve
        5-Fiyatları gelsin

         */
        girisEkranı();




    }

    private static void girisEkranı() {
        System.out.println("=========WISE MARKETE HOSGELDİNİZ===========");
        System.out.println("-------------MENU-----------------");
        System.out.println("Lütfen alışveriş yapmak istdeğiniz reyonu seçiniz");
        System.out.println("1-Manav reyonu \n 2-Şarküteri reyonu \n Market reyonu" +
                "\n 4-Fiş yazdır\n Çıkış");

        int secim= scan.nextInt();

        if(!(secim>=1&&secim<=5)){
            System.out.println("Lütfen geçerli bir değer giriniz");
            girisEkranı();
        }else {
            switch (secim){
                case 1 :
                    manav();
                    break;
                case 2:
                   sarkuteri();
                  break;
              case 3:
                   market();
                   break;
        //       case 4 :
        //           fisYazdır();
        //           break;
        //      case 5 :
        //          cikis();
        //           break;
        //       default:

            }
        }


    }

    private static void market() {
    }

    private static void sarkuteri() {
        System.out.println("Lütfen alcağınız ürün kodunu seçiniz:\n" +
                "6-Kaşar peyniri 130Tl\n7-Zeytin 50Tl\n"
                +"\n 8-Pastırma 450 Tl\n9-Kıyma 140 Tl");
        while (!ekUrun){
            urunKodu=scan.nextInt();
            if (urunKodu>=6&&urunKodu<=9){
                System.out.println("Kaç kg alacaksınız :");
                urunAdedi=scan.nextInt();
                switch (urunKodu){
                    case 6:
                        urunAdi="Kaşar Peyniri";
                        urunFiyati=130;
                        System.out.println(urunAdedi+" KG "+urunAdi+": "+
                                (urunFiyati*urunAdedi)+"Tl dir");
                        break;
                    case 7 :
                        urunAdi="Zeytin";
                        urunFiyati=50;
                        System.out.println(urunAdedi+" KG "+urunAdi+": "+
                                (urunFiyati*urunAdedi)+"Tl dir");
                        break;
                    case 8:
                        urunAdi="Pastırma";
                        urunFiyati=450;
                        System.out.println(urunAdedi+" KG "+urunAdi+": "+
                                (urunFiyati*urunAdedi)+"Tl dir");
                        break;
                    case 9:
                        urunAdi="Kıyma";
                        urunFiyati=140;
                        System.out.println(urunAdedi+" KG "+urunAdi+": "+
                                (urunFiyati*urunAdedi)+"Tl dir");
                        break;

                }
                urunFiyati=urunAdedi*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Toplam fiyat: "+toplam);
                sepet+=urunAdi+" ."+urunFiyati+"Tl dir";
                System.out.println("Ek ürün almak isterseniz ilgili ürün kodunu giriniz\n" +
                        "Almak istemiyorsanız 0 tuşuna basınız ");

            } else if (urunKodu==0) {
                girisEkranı();
                
            }
        }
        }


    private static void manav() {
        System.out.println("Lütfen alacağınız ürün kodunu yazınız:1-Patates 10tl\n " +
                "2-Soğan 12 tl \n 3-Elma 15tl \n 4-Portokal 15tl " +
                "5- Ananas 30 tl");
        while (!ekUrun){
            urunKodu= scan.nextInt();

            System.out.println("Kaç kg alacaksınız");
            urunAdedi= scan.nextInt();

            switch (urunKodu){
                case 1 :
                    urunAdi="Patates";
                    urunFiyati=10;
         System.out.println(urunAdedi+"Kg"+urunAdi+"Fiyatı"+urunFiyati*urunAdedi+"Tl");
         break;

                case 2 :
                    urunAdi="Soğan";
                    urunFiyati=12;
        System.out.println(urunAdedi+"Kg"+urunAdi+"Fiyat1ı"+urunFiyati*urunAdedi+"Tl");
         break;

                case 3 :
                    urunAdi="Elma";
                    urunFiyati=15;
          System.out.println(urunAdedi+"Kg"+urunAdi+"Fiyatı"+urunFiyati*urunAdedi+"Tl");
         break;

                case 4 :
                    urunAdi="Portakal";
                    urunFiyati=20;

          System.out.println(urunAdedi+"Kg"+urunAdi+"Fiyatı"+urunFiyati*urunAdedi+"Tl");
         break;

                case 5 :
                    urunAdi="Ananas";
                    urunFiyati=30;
         System.out.println(urunAdedi+"Kg"+urunAdi+"Fiyatı"+urunFiyati*urunAdedi+"Tl");
        break;

            }
            urunFiyati=urunFiyati*urunAdedi;
            toplam+=urunFiyati;
            System.out.println("Olusan sepet tutarı "+ toplam);

            sepet+=urunAdi+":"+urunFiyati+"Tl dir";

    System.out.println("Baska urun almak istermisiniz ?Ana menü için 0 a basınız");




        }
    }

}
