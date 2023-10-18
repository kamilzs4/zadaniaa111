import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int linijka = 0;
        System.out.print("Podaj nazwę pliku: ");
        String nazwapliku = scanner.nextLine();
        File file = new File(nazwapliku);
        if (file.exists()) {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine() && linijka < 5) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                linijka++;
            }
            fileScanner.close();
        } else {
            System.err.println("Plik nie istnieje.");
        }
    }
}
