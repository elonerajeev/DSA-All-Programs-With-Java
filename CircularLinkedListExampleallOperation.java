import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class CircularLinkedListExampleallOperation {
    static Node head;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("\n*********Main Menu*********");
            System.out.println("Choose one option from the following list ...");
            System.out.println("===============================================");
            System.out.println("1. Insert in beginning");
            System.out.println("2. Insert at last");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from last");
            System.out.println("5. Search for an element");
            System.out.println("6. Show");
            System.out.println("7. Exit");
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
                    beginDelete();
                    break;
                case 4:
                    lastDelete();
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

    static void begInsert() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter the node data:");
        int item = scan.nextInt();
        ptr.data = item;

        if (head == null) {
            ptr.next = ptr;
            head = ptr;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            ptr.next = head;
            temp.next = ptr;
            head = ptr;
        }
        System.out.println("Node inserted");
    }

    static void lastInsert() {
        Scanner scan = new Scanner(System.in);
        Node ptr = new Node();
        System.out.println("Enter the node data:");
        int item = scan.nextInt();
        ptr.data = item;

        if (head == null) {
            ptr.next = ptr;
            head = ptr;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = ptr;
            ptr.next = head;
        }
        System.out.println("Node inserted");
    }

    static void beginDelete() {
        if (head == null) {
            System.out.println("UNDERFLOW");
        } else if (head.next == head) {
            head = null;
            System.out.println("Node deleted");
        } else {
            Node ptr = head;
            while (ptr.next != head) {
                ptr = ptr.next;
            }
            ptr.next = head.next;
            head = head.next;
            System.out.println("Node deleted");
        }
    }

    static void lastDelete() {
        if (head == null) {
            System.out.println("UNDERFLOW");
        } else if (head.next == head) {
            head = null;
            System.out.println("Node deleted");
        } else {
            Node ptr = head;
            Node preptr = null;
            while (ptr.next != head) {
                preptr = ptr;
                ptr = ptr.next;
            }
            preptr.next = head;
            System.out.println("Node deleted");
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
}
