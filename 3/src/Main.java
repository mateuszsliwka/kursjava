import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Mateusz on 2017-04-23.
 */
public class Main {

    public static void main(String[] args) {
        ////zadanie 1
        System.out.println();
        System.out.println("Zadanie 1.");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        ////zadanie 2
        System.out.println("Zadanie 2.");
        for (char alfabet = 'a'; alfabet <= 'z'; alfabet++)
            System.out.print(alfabet);

        ///zadanie 3
        System.out.println();
        System.out.println("Zadanie 3.");
        int tab[] = new int[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = (i + 1) * 11;
        }
        for (int x : tab)
            System.out.println(x);


        ///zadanie4
        System.out.println();
        System.out.println("Zadanie 4.");
        int[][] tablica = new int[3][];
        tablica[0]=new int[5];
        tablica[1]=new int[3];
        tablica[2]=new int[7];

        for(int i=0; i<tablica.length;i++)
            for (int j=0;j<tablica[i].length;j++)
                tablica[i][j]=1;

        for(int i=0; i<tablica.length;i++)
        {for (int j=0;j<tablica[i].length;j++)
                System.out.print(tablica[i][j]);
        System.out.println("");}
    }
}

