package week04;

public class P05_forLoop {
    public static void main(String[] args) {

        /*
          //verilen String'deki kullalanilan harfleri
          // kelimeyi ve tekrarsiz halini yazdirip
          // kelimede kullanilan farkli harf sayisini yazdırın

 */

        String input="Have nice day";
        String tekrarsizInput="";
        String islenecekKelime=input.replaceAll("\\W","");

        System.out.println(input.substring(0,1));
        tekrarsizInput=islenecekKelime.substring(0,1);

        for (int i = 1; i <islenecekKelime.length() ; i++) {

            if (!tekrarsizInput.contains(islenecekKelime.substring(i,i+1))){

                System.out.println(","+islenecekKelime.substring(i,i+1));

                tekrarsizInput=islenecekKelime.substring(i+i+i);
            }

        }
    }
}
