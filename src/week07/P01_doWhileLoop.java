package week07;

public class P01_doWhileLoop {
    public static void main(String[] args) {

        /*
        k halfin t halfine kadar hafleri yazdırın.
         */

        char ilkHalf='k';
        do {
            System.out.print(ilkHalf+"-");
            ilkHalf++;
        }while (ilkHalf<='t');

    }
}
