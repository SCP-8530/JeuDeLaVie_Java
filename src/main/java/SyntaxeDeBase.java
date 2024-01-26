import java.lang.reflect.Array;
import java.util.Scanner;

public class SyntaxeDeBase {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int nombre;
        int nombre1 = 0;
        Integer nombre2;
        Integer nombre3 = 5;

        String nom = "L'annomalie";
        boolean estAdulte = true;
        Boolean estAdulte2 = true;

        float f1 = 1.1F;
        Float f2 = 1.2F;

        int[] nombres = new int[1];
        Array.set(nombres,0,1);

        System.out.println("Taper votre nom: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf("Bonjour %s!", name);
    }

}
