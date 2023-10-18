import java.util.Random;
import java.util.Scanner;
public class zadanie22 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double pieniadzewplacone = scanner.nextDouble();
        double kwotapoczatkowa;
        kwotapoczatkowa = pieniadzewplacone;
        int koniec = 1;
        while (true) {
            int slowo1 = random.nextInt(5);
            int slowo2 = random.nextInt(5);
            int slowo3 = random.nextInt(5);
            System.out.println("Obrazek: " + slowo1);
            System.out.println("Obrazek: " + slowo2);
            System.out.println("Obrazek: " + slowo3);
            if (slowo1 == slowo2 && slowo2 == slowo3) {
                pieniadzewplacone = pieniadzewplacone * 3;
                System.out.println("Brawo 3 obrazki sie zgadzaja wygrywasz trzykrtonosci: " + pieniadzewplacone);
                System.out.println("Chcesz grac dalej? jak nie wpisz 0, a jak nie to 1");
                koniec = scanner.nextInt();
                if (koniec == 0) {
                    System.out.println("Wygrales: " + pieniadzewplacone);
                    System.exit(0);
                } else {
                    System.out.println("Wplaciles: " + kwotapoczatkowa + "Przegrales wszystko, a mogles: " + pieniadzewplacone);
                    System.exit(0);
                }
            }

            if (slowo1 == slowo2 || slowo1 == slowo3 || slowo2 == slowo3) {
                pieniadzewplacone = pieniadzewplacone * 2;
                System.out.println("Brawo 2 obrazki sie zgadzaja wygrajesz dwukrtonosc: " + pieniadzewplacone);
                System.out.println("Chcesz grac dalej? jak nie wpisz 0, a jak nie to 1");
                koniec = scanner.nextInt();
                if (koniec == 0) {
                    System.out.println("Wygrales: " + pieniadzewplacone);
                    System.exit(0);
                }
            } else {
                System.out.println("Wplaciles: " + kwotapoczatkowa + "Przegrales wszystko, a mogles: " + pieniadzewplacone);
                System.exit(0);
            }
        }
    }}




