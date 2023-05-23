package week01;

public class P02_dataTypes {
    public static void main(String[] args) {

    /*
    byte : sadece tam sayi deger alir
    short :sadece tam sayi deger alir
    int :sadece tam sayi deger alir
    long:sadece tam sayi deger alir

    float:ondalıklı sayi değerleri alır sonuna f zorunlu
    double:ondalıklı sayi değerleri alır.

    double>float>long>int>short>byte



    boolean:true yada false verir.
    char: tek tırnak içinde tek karakter. yada tırnak içinde olmadan sayi
                                        yazılır ordada ascii tablosuna bakarız.

     */
        byte b1=Byte.MAX_VALUE;
        System.out.println("b1= "+b1);//127

        long l1=Long.MIN_VALUE;
        System.out.println("l1 = " + l1);

    }
}
