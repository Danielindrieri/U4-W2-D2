import java.util.*;

public class Esercizio2 {
    public static void funzione() {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int N = myscanner.nextInt();
        myscanner.nextLine();

        ArrayList<Integer> InteroRan = new ArrayList<Integer>();
        Random myrandom = new Random();

        for (int i = 0; i < N; i++) {
            InteroRan.add(myrandom.nextInt(100) + 1);  // Numeri tra 1 e 100
        }
        System.out.println("Lista originale: " + InteroRan);

        ArrayList<Integer> reversedList = Reverse(InteroRan);
        System.out.println("Lista invertita: " + reversedList);

        System.out.println("Vuoi applicare il filtro pari/dispari? (true/false)");
        boolean filtro = myscanner.nextBoolean();

        StampaPariDispari(InteroRan, filtro);
    }

    public static ArrayList<Integer> Reverse(ArrayList<Integer> InteriRan) {
        ArrayList<Integer> listaReverse = new ArrayList<>(InteriRan);
        Collections.sort(listaReverse, Collections.reverseOrder());
        return listaReverse;
    }
    public static void StampaPariDispari(ArrayList<Integer> lista, boolean filtro) {
        if (filtro) {
            System.out.println("Stampo i numeri pari in posizioni pari e dispari in posizioni dispari:");
            for (int i = 0; i < lista.size(); i++) {
                int numero = lista.get(i);
                if ((i % 2 == 0 && numero % 2 == 0) || (i % 2 != 0 && numero % 2 != 0)) {
                    System.out.println("Posizione " + i + ": " + numero);
                }
            }
        } else {
            System.out.println("Stampo la lista senza filtro:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            }
        }
    }

    public static void main(String[] args) {
        funzione();
    }
}
