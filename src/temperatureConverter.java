/**
 * Created by dawid on 27.07.15.
 */
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){
        System.out.println(" Temperature Converter ");
        System.out.println("1.Zamiana z stC na stF.");
        System.out.println("2.Zamiana z stF na stC.");
        System.out.println("3.Zamiana z stC na K.");
        System.out.println("4.Zamiana z K na stC.");
        System.out.println("5.Zamiana z K na stF.");
        System.out.println("6.Zamiana z stF na K.");
        System.out.println("7.Ostatnia operacja.   ");
        System.out.println("8.Archiwum operacji.   ");
        System.out.println("9.Wyjście.             ");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("Zamiana ze Stopni Celcjusza na Stopnie Fahrenheita.");

                break;
            case 2:
                System.out.println("Zamiana ze Stopni Fahrenheita na Stopnie Celcjusza.");

                break;
            case 3:
                System.out.println("Zamiana ze Stopni Celcjusza na Kelwiny.");

                break;
            case 4:
                System.out.println("Zamiana z Keliwnów na Stopnie Celcjusza.");

                break;
            case 5:
                System.out.println("Zamiana z Kelwinów na Stopnie Fahrenheita.");

                break;
            case 6:
                System.out.println("Zamiana ze Stopni Fahrenheita na Kelwiny.");

                break;
            case 7:
                System.out.println("Ostatnia operacja.");

                break;
            case 8:
                System.out.println("Archiwum operacji.");

                break;
            case 9:
                System.exit(99);
                break;
        }

    }
}
