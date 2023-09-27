import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class SinglyLinkedListAllOperations {
    static Node head;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while (choice != 9) {
            System.out.println("\n*********Main Menu*********");
            System.out.println("Choose one option from the following list ...");
            System.out.println("===============================================");
            System.out.println("1. Insert in the beginning");
            System.out.println("2. Insert at the last");
            System.out.println("3. Insert at any random location");
            System.out.println("4. Delete from the beginning");
            System.out.println("5. Delete from the last");
            System.out.println("6. Delete node after specified location");
            System.out.println("7. Search for an element");
            System.out.println("8. Show");
            System.out.println("9. Exit");
            System.out.println("Enter your choice:");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    begInsert();
                    break;
                case 2:
                    lastInsert();
                    break;
                case 3:
                    randomInsert();
                    break;
                case 4:
                    beginDelete();
                    break;
                case 5:
                    lastDelete();
                    break;
                case 6:
                    randomDelete();
                    break;
                case 7:
                    search();
                    break;
                case 8:
                    display();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }

    static void begInsert() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter value:");
        int item = scan.nextInt();
        ptr.data = item;
        ptr.next = head;
        head = ptr;
        System.out.println("Node inserted");
    }

    static void lastInsert() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter value:");
        int item = scan.nextInt();
        ptr.data = item;

        if (head == null) {
            ptr.next = null;
            head = ptr;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ptr;
            ptr.next = null;
        }
        System.out.println("Node inserted");
    }

    static void randomInsert() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter element value:");
        int item = scan.nextInt();
        ptr.data = item;

        System.out.println("Enter the location after which you want to insert:");
        int loc = scan.nextInt();

        Node temp = head;
        for (int i = 0; i < loc; i++) {
            if (temp == null) {
                System.out.println("Can't insert");
                return;
            }
            temp = temp.next;
        }

        ptr.next = temp.next;
        temp.next = ptr;
        System.out.println("Node inserted");
    }

    static void beginDelete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node ptr = head;
            head = ptr.next;
            ptr = null;
            System.out.println("Node deleted from the beginning");
        }
    }

    static void lastDelete() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
            System.out.println("Only node of the list deleted");
        } else {
            Node ptr = head;
            Node ptr1 = null;
            while (ptr.next != null) {
                ptr1 = ptr;
                ptr = ptr.next;
            }
            ptr1.next = null;
            ptr = null;
            System.out.println("Deleted node from the last");
        }
    }

    static void randomDelete() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the location of the node after which you want to perform deletion:");
        int loc = scan.nextInt();
        Node ptr = head;
        Node ptr1 = null;
        for (int i = 0; i < loc; i++) {
            if (ptr == null) {
                System.out.println("Can't delete");
                return;
            }
            ptr1 = ptr;
            ptr = ptr.next;
        }
        ptr1.next = ptr.next;
        ptr = null;
        System.out.println("Deleted node " + (loc + 1));
    }

    static void search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item you want to search for:");
        int item = scan.nextInt();
        Node ptr = head;
        int i = 0;
        int flag = 1;

        while (ptr != null) {
            if (ptr.data == item) {
                System.out.println("Item found at location " + (i + 1));
                flag = 0;
            }
            i++;
            ptr = ptr.next;
        }

        if (flag == 1) {
            System.out.println("Item not found");
        }
    }

    static void display() {
        Node ptr = head;
        if (ptr == null) {
            System.out.println("Nothing to print");
        } else {
            System.out.println("Printing values . . . . .");
            while (ptr != null) {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
}
