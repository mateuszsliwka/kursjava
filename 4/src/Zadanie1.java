import java.util.Scanner;

/**
 * Created by Mateusz on 2017-04-24.
 */
public class Zadanie1 {
    /*
    Użytkwonik podaje 3 wartości liczbowe typu int. Sprawdź czy te podane trzy cyfry moga byc ramoonami trojkata
     */
    public static void main (String args[])
    {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        a=scanner.nextInt();
        System.out.print("b=");
        b=scanner.nextInt();
        System.out.print("c=");
        c=scanner.nextInt();
        if(a<b+c&&b<a+c&&c<a+b)
            System.out.println("tak");
        else
            System.out.println("nie");



    }
}
