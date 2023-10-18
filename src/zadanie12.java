import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sprzedaz = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr " + (i + 1) + ": ");
            sprzedaz[i] = scanner.nextInt();
        }
        System.out.println("WYKRES");
        for (int i = 0; i < 5; i++) {
            System.out.print("Sklep nr: " + (i + 1) + ": ");
            int liczbagw = sprzedaz[i] / 100;
            for (int j = 0; j < liczbagw; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
