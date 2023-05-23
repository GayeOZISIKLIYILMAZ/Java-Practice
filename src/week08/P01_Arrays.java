package week08;

import java.util.Arrays;

public class P01_Arrays {

   /*
   Veilen bir int arryin tüm elemanlarını 2 arttırıp bize döndüren
   bir method oluşturun Eski arryi yeni haliyle kaydedin
    */

    public static void main(String[] args) {

        int[]arr={2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arryeIkiEkle(arr)));

        arryeIkiEkle(arr);
    }

    private static int[] arryeIkiEkle(int[] arr) {

        int [] yeniArr=new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i]+2;

        }arr=yeniArr;
        return arr;
    }

}
