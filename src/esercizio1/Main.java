package esercizio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ciaone");

        long[] numbers = new long[5];
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = randomNum();
        }
        System.out.println(Arrays.toString(numbers));

        whichNumberModify(numbers);
        scanner.close();

    }

    public static long randomNum() {
        long rNum = Math.round(Math.random() * 9) + 1;
        return rNum;
    }
    public static void whichNumberModify(long[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale elemento vuoi modificare? Da 1 a 5. Il numero 0 ferma il processo di selezione");
        long numChoice = scanner.nextLong();
        //if (numChoice instanceof long) {
        //}
        if (numChoice > 5) {
            try {
                throw new esercizio1.InvalidStringException("Ciaone sono un burlone");
            } catch (esercizio1.InvalidStringException e) {
                throw new RuntimeException(e);
            }
            //throw new Error("Errore, il numero selezionato è più grande dell'array fornito");
        } else {
            if (numChoice == 0) {
                System.out.println("Processo terminato");
                scanner.close();
            } else {
                System.out.println("Bene, modificherai il numero in posizione " + numChoice + ", ora che numero vuoi al suo posto?");
                long modifyNum = scanner.nextLong();
                numbers[(int) numChoice - 1] = modifyNum;
                System.out.println(Arrays.toString(numbers));
                whichNumberModify(numbers);
                scanner.close();
            }
        }
    }
}
