/**
 * Created by dawid on 27.07.15.
 */
import java.io.File;
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
        System.out.print(": ");
        int menu = sc.nextInt();
        File log = new File("log.txt");
        File last = new File("last.txt");
        double stC;
        double stF;
        double K;
        double wczytaj;

        switch (menu){
            case 1:
                System.out.println("Zamiana ze Stopni Celcjusza na Stopnie Fahrenheita.");
                System.out.print("Podaj ile stC chcesz zamienić: ");
                wczytaj = sc.nextDouble();
                stF = (((1.8)*wczytaj)+32);
                System.out.println(wczytaj + " stC to "+stF+" stF");
                //stF=32+9/5*Tcelcius
                break;
            case 2:
                System.out.println("Zamiana ze Stopni Fahrenheita na Stopnie Celcjusza.");
                System.out.print("Podaj ile stF chcesz zamienić: ");
                wczytaj = sc.nextDouble();
                stC = 0.555555556*(wczytaj-32);
                //do zaaokrąglenia
                System.out.println(wczytaj+ " stF to " + stC + " stC");
                //stC = 5/9*(stF-32)
                break;
            case 3:
                System.out.println("Zamiana ze Stopni Celcjusza na Kelwiny.");
                System.out.print("Podaj ile stC chcesz zamienić: ");
                wczytaj = sc.nextDouble();
                K = 273.15+wczytaj;
                System.out.println(wczytaj+ " stC to " + K + " Kelwinów");
                //K=273,15+stC
                break;
            case 4:
                System.out.println("Zamiana z Keliwnów na Stopnie Celcjusza.");
                System.out.print("Podaj ile Kelwinów chcesz zamienić: ");
                wczytaj = sc.nextDouble();
                stC = wczytaj-273.15;
                System.out.println(wczytaj+ " Kelwinów to " + stC + " stC");
                //stC=K-273,15
                break;
            case 5:
                System.out.println("Zamiana z Kelwinów na Stopnie Fahrenheita.");
                System.out.print("Podaj ile Kelwinów chcesz zamienić: ");
                wczytaj = sc.nextDouble();
                double tmp = wczytaj-273.15;
                stF = 32+1.8*tmp;
                System.out.println(wczytaj+ " Kelwinów to " + stF + " stF");
                //K-273,15=tmp
                //stF = 32+9/5*tmp
                break;
            case 6:
                System.out.println("Zamiana ze Stopni Fahrenheita na Kelwiny.");
                System.out.print("Podaj ile stF chcesz zamienić: ");
                wczytaj = sc.nextDouble();
                tmp = 0.555555556*(wczytaj-32);
                //do zaaokrąglenia
                K = 273.15+tmp;
                System.out.println(wczytaj+ " stF to " + K + " Kelwinów");
                //5/9*(stF-32)=tmp
                //K=273,15+tmp
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
