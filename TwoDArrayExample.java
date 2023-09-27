import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Row : ");
        int sizeOfRow = scan.nextInt();
        System.out.println("Enter the Size of Column : ");
        int sizeOfColumn = scan.nextInt();
        int[][] array = new int[sizeOfRow][sizeOfColumn];

        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                System.out.println("Enter " + i + "" + j + " Element : ");
                array[i][j] = scan.nextInt();
            }
        }

        System.out.println("The Array Is : ");
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        int sumOfPositive = 0;
        int sumOfNegative = 0;
        int sumOfZero = 0;
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                if (array[i][j] > 0) {
                    sumOfPositive++;
                } else if (array[i][j] < 0) {
                    sumOfNegative++;
                } else {
                    sumOfZero++;
                }
            }
        }

        // System.out.println("The Positive Number of Array : " + sumOfPositive);
        // System.out.println("The Negative Number of Array : " + sumOfNegative);
        // System.out.println("The Zero Number of Array : " + sumOfZero);

        int totalSize = sizeOfRow*sizeOfColumn;
        double S = sumOfPositive/totalSize;
        double N = sumOfNegative/totalSize;
        double Z = sumOfZero/totalSize;

        System.out.println(S);
        System.out.println(N);
        System.out.println(Z);
    }
}
