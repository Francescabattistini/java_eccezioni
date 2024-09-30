package esercizio_2;
import java.util.Scanner;

public class IntVersion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Quanti Km?");
            int km = Integer.parseInt(scanner.nextLine());
            System.out.println("Quanti litri?");
            int litri = Integer.parseInt(scanner.nextLine());
            System.out.println("Il consumo è di " + calcoloConsumo(km, litri) + " km al litro");
        } catch (ArithmeticException e) {
            System.out.println ("Impossibile dividere per 0");
        } catch (NumberFormatException e) {
            System.out.println ("Devi inserire dei numeri interi!");
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
    }

    private static int calcoloConsumo(int km, int litri) {
        return km / litri;
    }
}
