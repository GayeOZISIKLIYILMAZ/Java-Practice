package week08;

import java.util.Arrays;

public class P03_Arrays {
    /*
    Verilen bir arryde tüm elemanları sağa kaydırıp
    sondaki elementide başa taşıyacak bir method oluşturun
    arryi yeni haliyle kaydedin.
     */

    public static void main(String[] args) {

        int []arr={10,12,14,16,8};
        elementleriSagaKaydir(arr);
        System.out.println(Arrays.toString(elementleriSagaKaydir(arr)));
    }

    private static int[] elementleriSagaKaydir(int[] arr) {

        int[] yeniArr=new int[arr.length];
        yeniArr[0]=arr[arr.length-1];
        for (int i = 0; i < arr.length-1 ; i++) {

            yeniArr[i+1]=arr[i];

        }
        arr=yeniArr;
        return arr;
    }
}
