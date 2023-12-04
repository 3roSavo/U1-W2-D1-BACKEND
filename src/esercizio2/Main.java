package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("weeeeee");

        System.out.println("Inserisci km effettuati");
        double kmEffettuati = scanner.nextDouble();

        System.out.println("Ora i litri consumati");
        double litriConsumati = scanner.nextDouble();
        if (litriConsumati == 0) {
            try {
                throw new LitersZeroException("hai impostato i litri a 0 e questo è un problema");
            } catch (LitersZeroException e) {
                throw new RuntimeException(e);
            }
        } else {
            Auto auto1 = new Auto(kmEffettuati,litriConsumati);
            System.out.println("l'auto ha percorso " + auto1.getKmPercorsi() + " km, e ha consumato " + auto1.getLitriConsumati() + " litri");
            auto1.calcolaKmLitro();
        }
    }
}
