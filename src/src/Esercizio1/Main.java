package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //**************************** parte prima **********************//

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        // ho istanziato l'oggetto

        int [] array = new int [5];

        // creo numero random con questo metodo

        Random random = new Random();
        //  faccio un ciclo per dare all'indice un numero casuale
        for(int i = 0; i< array.length; i++){
            // qui mi genero un numero random da 1 a 10
            int randomNum = random.nextInt(1,10);
            // metto il numero casuale nell'array
            array[i]= randomNum;
        }
        // uso il metodo degli array per trasformate in sringa
        System.out.println(Arrays.toString(array));
        //****************************parte seconda****************************//

        int index = 10;
        while (index > 0) {
            System.out.println("A che indice vuoi inserire il tuo numero? Inserire l'indice, inserire 0 per uscire dall'applicazione");
            try {
                index = Integer.parseInt(scanner.nextLine());
                cambioArray(index, array);
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un numero intero!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice fuori dall'array, riprova!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

// metodo che cambial'indice nell'array preso e fa inserire il numero cambiandolo in stringa
    private static void cambioArray( int index, int[] arr) {
        Random rand = new Random();
        arr[index]=rand.nextInt(1,10);
        System.out.println(Arrays.toString(arr));
    }
}