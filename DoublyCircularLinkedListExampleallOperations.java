import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;
}

public class DoublyCircularLinkedListExampleallOperations {
    static Node head;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("\n*********Main Menu*********");
            System.out.println("Choose one option from the following list ...");
            System.out.println("===============================================");
            System.out.println("1. Insert in Beginning");
            System.out.println("2. Insert at last");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from last");
            System.out.println("5. Search");
            System.out.println("6. Show");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    insertionBeginning();
                    break;
                case 2:
                    insertionLast();
                    break;
                case 3:
                    deletionBeginning();
                    break;
                case 4:
                    deletionLast();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    display();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }
    }

    static void insertionBeginning() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter Item value:");
        int item = scan.nextInt();
        ptr.data = item;

        if (head == null) {
            ptr.next = ptr;
            ptr.prev = ptr;
            head = ptr;
        } else {
            Node temp = head;
            ptr.next = temp;
            ptr.prev = temp.prev;
            temp.prev.next = ptr;
            temp.prev = ptr;
            head = ptr;
        }
        System.out.println("Node inserted");
    }

    static void insertionLast() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter value:");
        int item = scan.nextInt();
        ptr.data = item;

        if (head == null) {
            ptr.next = ptr;
            ptr.prev = ptr;
            head = ptr;
        } else {
            Node temp = head;
            ptr.prev = temp.prev;
            temp.prev.next = ptr;
            ptr.next = temp;
            temp.prev = ptr;
        }
        System.out.println("Node inserted");
    }

    static void deletionBeginning() {
        if (head == null) {
            System.out.println("UNDERFLOW");
        } else if (head.next == head) {
            head = null;
            System.out.println("Node deleted");
        } else {
            Node temp = head;
            head = head.next;
            head.prev = temp.prev;
            temp.prev.next = head;
            System.out.println("Node deleted");
        }
    }

    static void deletionLast() {
        if (head == null) {
            System.out.println("UNDERFLOW");
        } else if (head.next == head) {
            head = null;
            System.out.println("Node deleted");
        } else {
            Node temp = head.prev;
            temp.prev.next = head;
            head.prev = temp.prev;
            System.out.println("Node deleted");
        }
    }

    static void display() {
        Node ptr = head;

        if (head == null) {
            System.out.println("Nothing to print");
        } else {
            System.out.println("\nPrinting values ...");
            do {
                System.out.println(ptr.data);
                ptr = ptr.next;
            } while (ptr != head);
        }
    }

    static void search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item you want to search for:");
        int item = scan.nextInt();
        Node ptr = head;
        int i = 0;
        int flag = 1;

        if (ptr != null) {
            do {
                if (ptr.data == item) {
                    System.out.println("Item found at location " + (i + 1));
                    flag = 0;
                    break;
                }
                i++;
                ptr = ptr.next;
            } while (ptr != head);
        }

        if (flag == 1) {
            System.out.println("Item not found");
        }
    }
}
