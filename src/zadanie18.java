import java.util.Random;
import java.util.Scanner;

public class zadanie18 {
    public static void main(String[] args) {
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int liczbaProb = 0;
        while (true) {
            System.out.print("Podaj swoją próbę: ");
            int odgadywanaLiczba = scanner.nextInt();
            liczbaProb++;
            if (odgadywanaLiczba == wylosowanaLiczba) {
                liczbaProb = liczbaProb - 1;
                System.out.println("Brawo! Odgadłeś liczbę " + wylosowanaLiczba + " w " + liczbaProb + " próbach.");
                break;
            } else if (odgadywanaLiczba > wylosowanaLiczba) {
                System.out.println("Za duża liczba, spróbuj ponownie.");


            } else {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            }
        }
        scanner.close();
    }
}