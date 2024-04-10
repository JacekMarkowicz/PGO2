import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ile masz lat");
        int wiek = scanner.nextInt();
        System.out.println("czy jestes mieszkańcem warszawy");
        String obywatel = scanner.next();
        System.out.println("Czy chcesz iść do muzeum w czwartek(true albo false)");
        boolean wtorek = scanner.nextBoolean();
        double bilet = 40.0;
        if (wiek < 10) {
            bilet = 0.0;
        } else if (wiek >= 10 && wiek <= 18) {
            bilet *= 0.5;
        }if (obywatel.equalsIgnoreCase("warszawa")) {
            bilet *= 0.9;
        }if (wtorek) {
            bilet = 0.0;
        }
        double rabat = 100 - (bilet / 40 * 100);
        System.out.println( wiek + " lat, " +"Mieszkaniec warszawy: " + obywatel + ", " +  (wtorek ? "wtorek" : "nie wtorek12"));
        System.out.println("cena biletu: " + bilet + " zniżka: " + rabat + "%");

    }
}