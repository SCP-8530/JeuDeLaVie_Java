import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GameOfLife {
    private static final boolean O = true;
    private static final boolean l = false;
    private static boolean[][] TableauDepart = new boolean[][]{
            {O, O, O, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, O, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, O, l, O, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, O, l, O, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, O, l, l, l, l, l, l, O, O, O, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l},
            {l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l, l}
    };

    private static boolean[][] TableauDepart1 = new boolean[][] {
            {l, O, l},
            {l, O, l},
            {l, O, l}
    };
    private static boolean[][] TableauPresent;
    private static boolean[][] TableauFutur;

    public static void main(String[] args) {
        //creer un tableau
        TableauPresent = TableauDepart1;

        //boucle
        while (true) {
            //afficher le tableau
            AfficherTableau(TableauPresent);

            //pause
            System.out.println("Appuyer sur Enter pour passer a la generation suivante");
            Scanner scanner = new Scanner(System.in);
            String useless = scanner.nextLine();
            System.out.printf("%s%n%n%n%n%n%n%n%n%n%n%n%n", useless);

            //Aller generer le futur tableau
            TableauFutur = CreerFuturTableau(TableauPresent);
            TableauPresent = TableauFutur;

        }



    }

    public static void AfficherTableau(boolean[][] tab) {
        for(int i1 = 0; i1 < tab.length; i1++){
            for (int i2 = 0; i2 < tab[i1].length; i2++) {
                if (tab[i1][i2]) { System.out.print("█");}
                else {System.out.print(" ");}
            }
            System.out.print("\n");
        }
    }

    public static boolean[][] CreerFuturTableau(boolean[][] tab) {
        boolean[][] futurTab = new boolean[tab.length][tab[0].length];
        //bug sur le tableau qui etait nul. Solution trouver : https://www.developpez.net/forums/d326508/java/general-java/api-standards-tierces/collection-stream/debutant-initialiser-booleens-true-tableau/
        //Explication: Creation d'une boucle pour remplir le tableau
        for (int i = 0; i < futurTab.length; i++) {
            Arrays.fill(tab[i],false);
        }

        for (int i1 = 0; i1 < tab.length-1; i1++) {
            for (int i2 = 0; i2 < tab[i2].length-1; i1++) {
                //genere une cellule celon si elle est mort ou pas
                int[] cellulePresent;
                if (tab[i1][i2]) { cellulePresent = new int[]{i1,i2,1}; }
                else { cellulePresent = new int[]{i1,i2,0}; }

                //tester la survie de la cellule
                int[] celluleFuture = ChangeEtat(cellulePresent);

                //mettre le resultat dans le tableau
                if (celluleFuture[2] == 1) { futurTab[i1][i2] = true; }
                else { futurTab[i1][i2] = false; }
            }
        }

        return futurTab;
    }

    public static int[] ChangeEtat(int[] cellule) {
        int Y = cellule[0];
        int X = cellule[1];
        int etat = cellule[2];
        int nombre = 0;

        //Regarde les cellules autours
        if (X != 0) {
            if (Y != 0) if (TableauPresent[Y-1][X-1]) nombre++;
            if (TableauPresent[Y][X-1]) nombre++;
            if (Y != TableauPresent.length-1) if (TableauPresent[Y+1][X-1]) nombre++;
        }


        if (Y != 0) if (TableauPresent[Y-1][X]) nombre++;
        if (Y != TableauPresent.length-1) if (TableauPresent[Y+1][X]) nombre++;

        if (X != TableauPresent[Y].length) {
            if (Y != 0) if (TableauPresent[Y-1][X+1]) nombre++;
            if (TableauPresent[Y][X+1]) nombre++;
            if (Y != TableauPresent.length-1) if (TableauPresent[Y+1][X+1]) nombre++;
        }

        //retourne la cellule
        switch (nombre) {
            case 2: return new int[]{Y, X, etat};
            case 3: return new int[]{Y, X, 1};
            default: return new int[]{Y, X, 0};
        }
    }
}
