import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> Array = new ArrayList<Integer>();

        System.out.println("Enter Size Of Array : ");
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter " + i + "Element : ");
            int element = scan.nextInt();
            Array.add(element);
        }

        for (int j = 0; j < N; j++) {
            if (Array.get(j) == 0) {
                Array.remove(Array.get(j));
            }
        }

        System.out.println("Your Array Is : ");
        for (int i = 0; i < N; i++) {
            System.out.println(Array.get(i) + " ");
        }

    }
}