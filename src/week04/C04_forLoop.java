package week04;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {

     /*
        Kullanicidan bir String isteyin ve String'i tersine cevirip
                              kaydedin.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String str=scan.next();

        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);


        }
        System.out.println(tersStr);



    }
}
