package week02;

import java.util.Scanner;

public class Po6_TernaryOperotor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //"Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        System.out.println((kenar1 == kenar2 && kenar1 == kenar3 ? "Es kenar " :
                "Eskenar değil"));

        //kullanıcıdan bir half isteyin girilen karekter küçük half ise onu büyük
        //half olarak yazdırın  yoksa halfi yazdırın

        System.out.print("Lütfen bir half giriniz");
        char half = scan.next().charAt(0);
        //System.out.println (half>=97 && half<=122) ?(char)(half-32):half);
        System.out.println((half >= 'a' && half <= 'z' ? (char) (half - 32) : half));
        System.out.println(half >= 'a' && half <= 'z' ? Character.toUpperCase(half) : half);

        //3 şekildede yazılır.

        //Kullanıcıdan 2 adet sayi isteyin ve büyük olmayan sayiyi yazdırın

        System.out.println("Lütfen iki sayi girin");
        System.out.println("1.sayi : ");
        double sayi1 = scan.nextDouble();
        System.out.println("2.sayi : ");
        double sayi2 = scan.nextDouble();

        System.out.println(sayi1 > sayi2 ? "Büyük olmayan sayi" + sayi2 :
                  "Büyük olmayan sayi :" + sayi1);



        //Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
        //kucukse "Maalesef kaldin" yazdirin.

        System.out.println("Lütfen  notunuzu giriniz");
        double not=scan.nextDouble();

        System.out.println(not >= 50 ? "Sınıfı" + not + "ortolamasıyla geçtiniz"
                                         : "Maalesef " + not + "ile kaldınız");


    }
}
