import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
    private static List<int[]> CelluleActif;
    private static List<int[]> FuturCelluleActif;

    public Array ChangeEtat(int [] cellule) {
        int x = cellule[0];
        int y = cellule[1];
        int etat = cellule[2];
        int nombre = 0;

        //Regarde les
        if (CelluleActif.contains(new int[]{x - 1, y + 1, 1})) nombre++;
        if (CelluleActif.contains(new int[]{x, y + 1, 1})) nombre++;
        if (CelluleActif.contains(new int[]{x + 1, y + 1, 1})) nombre++;

        if (CelluleActif.contains(new int[]{x - 1, y, 1})) nombre++;
        if (CelluleActif.contains(new int[]{x + 1, y, 1})) nombre++;

        if (CelluleActif.contains(new int[]{x + 1, y + 1, 1})) nombre++;
        if (CelluleActif.contains(new int[]{x + 1, y + 1, 1})) nombre++;
        if (CelluleActif.contains(new int[]{x + 1, y + 1, 1})) nombre++;
    }
}
