package esercizio_2;
import java.util.Scanner;

public class DoubleVersion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Quanti Km?");
            double km = Double.parseDouble(scanner.nextLine());
            System.out.println("Quanti litri?");
            double litri = Double.parseDouble(scanner.nextLine());
            if (litri == 0) System.out.println("Benzina infinita!");
            else System.out.println("Il consumo è di " + calcoloConsumo(km, litri) + " km al litro");
        } catch (NumberFormatException e) {
            System.out.println ("Devi inserire dei numeri interi!");
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
    }

    private static double calcoloConsumo(double km, double litri) {
        return km / litri;
    }
}

