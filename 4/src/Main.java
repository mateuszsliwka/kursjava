import java.util.Scanner;

/**
 * Created by Mateusz on 2017-04-24.
 */
public class Main {
    public  static void main (String args[])
    {

        int b=7;
        switch (b)
        {
            case 1:
                System.out.println("b=1");
                break;
            case 2:
                System.out.println("b=2");
                break;
            case 3:
                System.out.println("b=3");
                break;
            case 4:
                System.out.println("b=4");
                break;
            case 5:
                System.out.println("b=5");
                break;
            default:
                System.out.println("zla wartosc");
        }

        int c=10;
        int d;
        d=c<10? -1 : 1;
        System.out.println(d);

        for(int i=0; i<10; i++)
        {
            System.out.print(i + " ");
            if(i==5)
                break;

        }
        System.out.println();
        for (int i=0;i<10;i++)
        {
            if(i%2==0) continue;
            System.out.print(i + " ");

        }
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        String name= "";
        name=scanner.next();
        System.out.println(name);


    }
}

