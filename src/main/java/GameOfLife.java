import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
    private static Boolean[][] TableauPresent;
    private static Boolean[][] TableauFutur;

    public static void main(String[] args) {
        //creer un tableau
        TableauPresent = new Boolean[][]{
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };

        //afficher le tableau
        AfficherTableau(TableauPresent);
    }

    public static void AfficherTableau(Boolean[][] tab) {
        for(int i1 = 0; i1 < tab.length; i1++){
            for (int i2 = 0; i2 < tab.length; i2++) {
                if (tab[i1][i2]) { System.out.print("#");}
                else {System.out.print(".");}
            }
            System.out.print("\n");
        }
    }

    public static int[] ChangeEtat(int[] cellule) {
        int x = cellule[0];
        int y = cellule[1];
        int etat = cellule[2];
        int nombre = 0;

        //Regarde les cellules autours
        if (TableauPresent[x-1][y+1]) nombre++;
        if (TableauPresent[x][y+1]) nombre++;
        if (TableauPresent[x+1][y+1]) nombre++;

        if (TableauPresent[x-1][y]) nombre++;
        if (TableauPresent[x+1][y]) nombre++;

        if (TableauPresent[x-1][y-1]) nombre++;
        if (TableauPresent[x][y-1]) nombre++;
        if (TableauPresent[x+1][y-1]) nombre++;

        //retourne la cellule
        switch (nombre) {
            case 2: return new int[]{x, y, etat};
            case 3: return new int[]{x, y, 1};
            default: return new int[]{x, y, 0};
        }
    }
}
