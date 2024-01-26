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

        Integer age = 69;
        if (age >= 18) {
            System.out.println("Vous pouvez voter");
        } else {
            System.out.println("Tu ne peux pas voter");
        }

        switch (age) {
            case 18:
                System.out.println("Tu es maintenant un adulte!");
                break;
            case 69:
                System.out.println("Nice");
                break;
            default:
                System.out.println("Allo :)");
        }

        for (Integer i = 0; i < 10; i++) {
            System.out.printf("Le nombre est %d%n", i);
        }

        while (age < 100) {
            System.out.printf("Vous avez %d ans%n", age);
            age++;
        }


    }

}
