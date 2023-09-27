import java.util.Scanner;

public class BinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = { 5, 9, 10, 20, 45, 45, 50, 56, 62, 70, 89 };
        System.out.println("Enter the Searching Item : ");
        int searchItem = scan.nextInt();

        int result = binarySearch(array, searchItem);

        if (result == -1) {
            System.out.println("No, Element (" + searchItem + ") Is Not Present");
        } else {
            System.out.println("Yes, Element (" + searchItem + ") Is Present at index " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index.
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half of the array.
            } else {
                right = mid - 1; // Search the left half of the array.
            }
        }

        return -1; // Element not found in the array.
    }
}
