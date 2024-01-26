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
    private static boolean[][] TableauPresent;
    private static boolean[][] TableauFutur;

    public static void main(String[] args) {
        //creer un tableau
        TableauPresent = TableauDepart;

        //afficher le tableau
        AfficherTableau(TableauPresent);
    }

    public static void AfficherTableau(boolean[][] tab) {
        for(int i1 = 0; i1 < tab.length - 1; i1++){
            for (int i2 = 0; i2 < tab[i1].length - 1; i2++) {
                if (tab[i1][i2]) { System.out.print("█");}
                else {System.out.print(" ");}
            }
            System.out.print("\n");
        }
    }

    public static int[] ChangeEtat(int[] cellule) {
        int Y = cellule[0];
        int X = cellule[1];
        int etat = cellule[2];
        int nombre = 0;

        //Regarde les cellules autours
        if (X != -1) {
            if (Y != -1) if (TableauPresent[Y-1][X+1]) nombre++;
            if (TableauPresent[Y][X+1]) nombre++;
            if (Y != TableauPresent.length) if (TableauPresent[Y+1][X+1]) nombre++;
        }


        if (Y != -1) if (TableauPresent[Y-1][X]) nombre++;
        if (Y != TableauPresent.length) if (TableauPresent[Y+1][X]) nombre++;

        if (X != TableauPresent[Y].length) {
            if (Y != -1) if (TableauPresent[Y-1][X-1]) nombre++;
            if (TableauPresent[Y][X-1]) nombre++;
            if (Y != TableauPresent.length) if (TableauPresent[Y+1][X-1]) nombre++;
        }

        //retourne la cellule
        switch (nombre) {
            case 2: return new int[]{Y, X, etat};
            case 3: return new int[]{Y, X, 1};
            default: return new int[]{Y, X, 0};
        }
    }
}
