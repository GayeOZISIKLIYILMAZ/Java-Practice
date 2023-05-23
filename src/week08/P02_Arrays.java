package week08;

import java.util.Arrays;

public class P02_Arrays {
    /*
    Verilen bir arrydeki pozitif tam sayıları toplayıp bize sonucu
    döndüren bir method yazınız
     */
    public static void main(String[] args) {

        int arr[] = {2, -7, -3, 10, 5, 9, 4, 35};

        System.out.println((arrydekiPozitifSayilariTopla(arr)));
        //Sonuç arr olarak dönüyorsa Arrays. toString ile yazdırırız !
        //Sonuç int dönüyorsa direk yazdırırız!

    }

    private static int arrydekiPozitifSayilariTopla(int[] arr) {
        int sonuc = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                sonuc += arr[i];
            }

        }
        return sonuc;



    }

}
