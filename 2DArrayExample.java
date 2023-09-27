import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TwoDArrayExample {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> array = new ArrayList<Integer>();
        System.out.println("Enter the Size of Row : ");
        int sizeOfRow = scan.nextInt();
        System.out.println("Enter the Size of Column : ");
        int sizeOfColumn = scan.nextInt();

        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                System.out.println("Enter " + i + " " + j + " Element : ");
                array.get[i][j] = scan.nextInt();
            }
        }
    }

}
