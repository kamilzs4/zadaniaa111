import java.util.Random;
import java.util.Scanner;

public class zadanie19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] kolory = {"czerwony", "zielony", "niebieski", "pomaranczowy", "zolty"};
        int poprawneOdpowiedzi = 0;

        System.out.println("proboj odgadnac kolor");

        for (int i = 0; i < 10; i++) {
            int losowyIndeks = random.nextInt(kolory.length);
            String wylosowanyKolor = kolory[losowyIndeks];

            System.out.print("podaj kolor (czerwo ny, zielony, niebieski, pomaranczowy, zolty): ");
            String wyborUzytkownika = scanner.nextLine();

            if (wyborUzytkownika.equals(wylosowanyKolor)) {
                System.out.println("Brawo! Poprawna odpowiedź.");
                poprawneOdpowiedzi++;
            } else {
                System.out.println("Komputer wybrał kolor: " + wylosowanyKolor);
            }
        }

        System.out.println("gra zakończona. Poprawnych odpowiedzi: " + poprawneOdpowiedzi);
    }
}
