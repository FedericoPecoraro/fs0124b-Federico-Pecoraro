package excercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        System.out.println("Inserisci il numero di elementi seguito dal tasto Invio.");
        int numElementi = Integer.parseInt(scanner.nextLine());

        if (numElementi > 0) {

            for (int i = 0; i < numElementi; i++) {
                System.out.println("Aggiungi una parola al set");
                String word = scanner.nextLine();
                boolean added = words.add(word);
                if (!added) {
                    System.out.println(word + " è già nell'elenco");
                    duplicates.add(word);
                }
            }

            System.out.println("Numero di parole distinte: " + words.size());
            System.out.println("Parole distinte: " + words);
            System.out.println("Parole duplicate: " + duplicates);
        } else {
            System.err.println("Inserire un numero superiore a 0");
        }

        scanner.close();
    }
}