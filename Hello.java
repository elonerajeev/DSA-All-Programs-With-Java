class DoubleLinkedList {
    Node head;

    class Node {
        int data;
        Node previous;
        Node next;

        Node(int element) {
            this.data = element;
            this.previous = null;
            this.next = null;
        }
    }

    // << ---- addFirstDLL Operation ---- >>
    public void addFirstDLL(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    // << ---- addLastDLL Operation ---- >>
    public void addLastDLL(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        newNode.previous = currentNode;
        currentNode.next = newNode;
    }

    // << ---- deleteAtFirst Operation ---- >>
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
            return; // Add a return statement to exit the method
        }
        head = head.next;
        if (head != null) {
            head.previous = null;
        }
    }

    // << ---- deleteAtLast Operation ---- >>
    public void deleteAtLast() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
            return; // Add a return statement to exit the method
        }
        
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        
        if (currentNode.previous != null) {
            currentNode.previous.next = null;
        } else {
            head = null; // Handle the case where there is only one element
        }
    }

    // << ---- printDLL Operation ---- >>
    public void printDDL() {
        if (head == null) {
            System.out.println("Doubly LinkedList Is Empty");
            return; // Add a return statement to exit the method
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(
                    "|| " + currentNode.previous + " -> " + currentNode.data + " -> " + currentNode.next + "|| ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}

public class PraticesofDSA {
    public static void main(String args[]) {
        DoubleLinkedList firstDoubleLinkedList = new DoubleLinkedList();

        firstDoubleLinkedList.addFirstDLL(100);
        firstDoubleLinkedList.addFirstDLL(101);
        firstDoubleLinkedList.addFirstDLL(102);
        firstDoubleLinkedList.addFirstDLL(103);

        firstDoubleLinkedList.addLastDLL(500);
        firstDoubleLinkedList.addLastDLL(501);
        firstDoubleLinkedList.addLastDLL(502);
        firstDoubleLinkedList.addLastDLL(503);

        firstDoubleLinkedList.deleteAtFirst();
        firstDoubleLinkedList.deleteAtLast();

        firstDoubleLinkedList.printDDL();
    }
}
