import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Handler;

public class Esercizio1 {
    public static void funzione() {
        Scanner myscanner = new Scanner(System.in);

        Set<String> interi = new HashSet<>();
        Set<String> duplicato = new HashSet<>();

        System.out.println("Inserisci il numero di elementi da inserire");
        int n = myscanner.nextInt();

        for (int i = 0;i < n; i++ ) {
            System.out.println("inserisci un altra parola" +(i + 1));
            String parola = myscanner.nextLine();
            if (!interi.add(parola)){
                duplicato.add(parola);
            }
        }
        System.out.println("parola duplicate"+ duplicato);
        System.out.println("Numero parola" + interi.size());
        System.out.println("elenco parole" + interi);

    }
}
