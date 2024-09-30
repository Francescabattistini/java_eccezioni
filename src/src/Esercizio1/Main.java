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



    }
}