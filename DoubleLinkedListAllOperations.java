import java.util.Scanner;

class Node {
    Node prev;
    Node next;
    int data;
}

public class DoubleLinkedListAllOperations {
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
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete from last");
            System.out.println("6. Delete the node after the given data");
            System.out.println("7. Search");
            System.out.println("8. Show");
            System.out.println("9. Exit");
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
                    insertionSpecified();
                    break;
                case 4:
                    deletionBeginning();
                    break;
                case 5:
                    deletionLast();
                    break;
                case 6:
                    deletionSpecified();
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

    static void insertionBeginning() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter Item value:");
        int item = scan.nextInt();
        ptr.data = item;

        if (head == null) {
            ptr.next = null;
            ptr.prev = null;
            head = ptr;
        } else {
            ptr.data = item;
            ptr.prev = null;
            ptr.next = head;
            head.prev = ptr;
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
            ptr.next = null;
            ptr.prev = null;
            head = ptr;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ptr;
            ptr.prev = temp;
            ptr.next = null;
        }
        System.out.println("Node inserted");
    }

    static void insertionSpecified() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter element value:");
        int item = scan.nextInt();
        ptr.data = item;

        System.out.println("Enter the location after which you want to insert:");
        int loc = scan.nextInt();

        Node temp = head;
        int i = 0;
        while (i < loc - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Can't insert");
            return;
        }

        ptr.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = ptr;
        }
        ptr.prev = temp;
        temp.next = ptr;

        System.out.println("Node inserted");
    }

    static void deletionBeginning() {
        if (head == null) {
            System.out.println("UNDERFLOW");
        } else if (head.next == null) {
            head = null;
            System.out.println("Node deleted");
        } else {
            Node ptr = head;
            head = head.next;
            head.prev = null;
            ptr = null;
            System.out.println("Node deleted");
        }
    }

    static void deletionLast() {
        if (head == null) {
            System.out.println("UNDERFLOW");
        } else if (head.next == null) {
            head = null;
            System.out.println("Node deleted");
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.prev.next = null;
            ptr = null;
            System.out.println("Node deleted");
        }
    }

    static void deletionSpecified() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the data after which the node is to be deleted:");
        int val = scan.nextInt();
        Node ptr = head;

        while (ptr != null) {
            if (ptr.data == val) {
                if (ptr.next != null) {
                    ptr.next.prev = ptr.prev;
                }
                if (ptr.prev != null) {
                    ptr.prev.next = ptr.next;
                } else {
                    head = ptr.next;
                }
                System.out.println("Node deleted");
                return;
            }
            ptr = ptr.next;
        }

        System.out.println("Node not found");
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
                break;
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
        System.out.println("\nPrinting values...");
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
}
