import java.util.Random;

public class zadanie21 {
    public static void main(String[] args) {
        Random random = new Random();
        int iloscczlowiek = 0;
        int iloscpc = 0;
        for (int i = 0; i < 10; i++) {
            int pc = random.nextInt(6) + 1;
            int czlowiek = random.nextInt(6) + 1;
            if (pc > czlowiek) {
                System.out.println("Wygral komputer");
                iloscpc++;
            }
            if (czlowiek > pc) {
                System.out.println("Wygral czlowiek");
                iloscczlowiek++;
            }
            if (czlowiek == pc) {
                System.out.println("Remis, powtorka");
                i--;
            }

        }
        if (iloscczlowiek > iloscpc) {
            System.out.println("Wygral czlowiek " + iloscczlowiek + " Do " + iloscpc);
        }
        else if (iloscczlowiek < iloscpc){
            System.out.println("Wygral PC " + iloscpc + " Do " + iloscczlowiek);
        }
        else{
            System.out.println("remis");
        }
    }
}
