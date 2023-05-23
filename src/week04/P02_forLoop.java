package week04;

import java.util.Scanner;

public class P02_forLoop {
    public static void main(String[] args) {


        /*
      Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
      dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
      baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

 */
   Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir başlangıc değeri girin");
        int baslangicDegeri=scan.nextInt();
        System.out.println("Lütfen bir bitiş seğeri giriniz");
        int bitişDegeri=scan.nextInt();

        int toplam=0;

       if (bitişDegeri<baslangicDegeri){
           System.out.println("Baslangıc değeri bitiş değerindem küçğk olamlıdır");


        }else {

           for (int i = baslangicDegeri; i <=baslangicDegeri; i++) {

               toplam+=i;

           }
           System.out.println("Girllen değerler arasındaki sayılar toplamı "+toplam);

       }



    }
}
