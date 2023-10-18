import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku do odczytu: ");
        String nazwapliku1 = scanner.nextLine();
        System.out.print("Podaj nazwę pliku do zapisu: ");
        String nazwapliku2 = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwapliku1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(nazwapliku2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Błąd odczytu/zapisu plików: " + e.getMessage());
        }
    }
}
