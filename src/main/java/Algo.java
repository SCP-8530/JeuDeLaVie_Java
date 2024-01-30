import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Algo {
    private static Integer[] TableauNonOrdonne;

    public static void main(String[] args) {
        Asking();

        Sorting(TableauNonOrdonne);

        System.out.print(Arrays.toString(TableauNonOrdonne));
    }

    /**
     * Algorithme de mise a propre
     * */
    public static Integer[] Sorting(Integer[] tab){
        while (true) {
            boolean hasSort = false;
            //BUBBLESORT
            for(int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i+1]) {
                    Integer a = tab[i];
                    Integer b = tab[i+1];
                    tab[i] = b;
                    tab[i+1] = a;

                    hasSort = true;
                }
            }

            if (!hasSort) { break; }
        }

        return tab;
    }

    /**
     * Demande de value
     * */
    public static void Asking(){
        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Combien de valeur a ajouter
        Integer nEI = 0;
        while (true) {
            System.out.println("Combien de value à mettre dans votre liste?");
            String nbElement = scanner.nextLine();
            try {
                Integer nbElementInt = Integer.parseInt(nbElement);
                nEI = nbElementInt;
                break;
            } catch (Exception e) {
                System.out.println("Vous devez mettre une valeur numerique");
            }
        }

        //Ajouter des element dans le tableau
        Integer[] tab = new Integer[nEI];
        for (int i = 0; i < nEI; i++) {
            while (true) {
                System.out.println("Ajoute un chiffre à la ligne");
                String number = scanner.nextLine();
                try {
                    Integer realNumber = Integer.parseInt(number);
                    tab[i] = realNumber;
                    break;
                } catch (Exception e) {
                    System.out.println("Vous devez mettre une valeur numerique");
                }
            }
        }

        //set tableau
        TableauNonOrdonne = tab;
    }
}
