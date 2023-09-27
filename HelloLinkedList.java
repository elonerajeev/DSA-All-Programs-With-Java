/**
 * A simple linked list implementation.
 */

class LinkedList {
    Node head;

    class Node {
        int Data;
        Node Next;

        Node(int element) {
            this.Data = element;
            this.Next = null;
        }
    }

    // << ---- addFirst Operation ---- >>
    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;
    }

    // << ---- addLast Operation ---- >>
    public void addLast(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.Next != null) {
            currentNode = currentNode.Next;
        }
        currentNode.Next = newNode;
        newNode.Next = null;
    }

    // << ---- printLinkedList Operation ---- >>
    public void printLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.Data + " -> ");
            currentNode = currentNode.Next;
        }
        System.out.println("null");
    }

    // << ---- deleteFirst Operation ---- >>
    public void deleteFirst() {
        if (head == null) {
            System.out.print("LinkedList Is Empty");
        }
        head = head.Next;
    }

    // << ---- deleteLast Operation ---- >>
    public void deleteLast() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
        }
        Node secondLastNode = head;
        Node lastNode = head.Next;
        while (lastNode != null) {
            secondLastNode = secondLastNode.Next;
            lastNode = lastNode.Next;
        }
        secondLastNode.Next = null;
    }

    // << ---- middleElementOfLinkedList Operation ---- >>
    public void middleElementOfLinkedList() {
        int size = 0;
        Node tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.Next;
        }
        tmp = head;
        System.out.println("size " + size);
        if (size % 2 == 0) {
            int n = size / 2;
            for (int i = 0; i < n; i++) {
                tmp = tmp.Next;
            }
            System.out.println("mid ele " + tmp.Data);
        } else {
            System.out.println("mid ele " + tmp.Data);
        }
    }

    // << ---- addAtAfterElement Operation ---- >>
    public void addAtAfterElement(int element, int item) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode != null && currentNode.Data != item) {
            currentNode = currentNode.Next;
        }
        if (currentNode == null) {
            System.out.println("Item not found in the list.");
        } else {
            newNode.Next = currentNode.Next;
            currentNode.Next = newNode;
        }
    }
}

public class HelloLinkedList {
    public static void main(String args[]) {
        LinkedList linkedListObject = new LinkedList();
        linkedListObject.addFirst(10);
        linkedListObject.addLast(20);
        linkedListObject.addLast(100);
        linkedListObject.addFirst(111);

        linkedListObject.printLinkedList();
        linkedListObject.middleElementOfLinkedList();

        linkedListObject.addAtAfterElement(2000, 20);
        linkedListObject.addAtAfterElement(2000, 100);
        linkedListObject.middleElementOfLinkedList();
        linkedListObject.printLinkedList();
    }
}
