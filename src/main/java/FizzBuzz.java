import com.sun.source.tree.CaseTree;

public class FizzBuzz {

    public static void main(String[] args) {
        for (Integer nombre = 0; nombre < 31; nombre++) {
            boolean f = false;
            boolean b = false;

            if (nombre % 3 == 0) { f = true; }
            if (nombre % 5 == 0) { b = true; }

            if (f && !b) {
                System.out.println("Fizz");
            } else if (!f && b) {
                System.out.println("Buzz");
            } else if (f && b) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(nombre);
            }
        }
    }
}
