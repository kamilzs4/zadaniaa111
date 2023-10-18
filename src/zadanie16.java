import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj miesięczne pieniadze: ");
        double budzet = scanner.nextDouble();
        double sumaWydatkow = 0;
        while (true) {
            System.out.print("Podaj wydane | 0=koniec: ");
            double wydatek = scanner.nextDouble();
            if (wydatek == 0) {
                break;
            }
            sumaWydatkow += wydatek;
        }
        double roznica = budzet - sumaWydatkow;
        System.out.println("Suma: " + sumaWydatkow);
        System.out.println("Różnica: " + roznica);
    }
}
