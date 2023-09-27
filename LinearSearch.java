import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int sizeofArray = 11;
        int array[] = { 10, 50, 20, 5, 9, 70, 45, 89, 62, 45, 56 };
        System.out.println("Enter the Searching Item : ");
        int searchItem = scan.nextInt();
        boolean found = false;

        // Linear Searching //
        for (int i = 0; i < sizeofArray; i++) {
            if (array[i] == searchItem) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, Element (" + searchItem + ") Is Present");
        } else {
            System.out.println("No, Element (" + searchItem + ") Is Not Present");
        }
    }
}
