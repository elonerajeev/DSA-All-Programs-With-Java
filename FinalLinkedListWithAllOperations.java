// package com.example.linkedlist; // Define the package name

// << ---- LinkedList Class ---- >>
class LinkedList {
    Node head;
    int size = 0;

    // << ---- Node Class ---- >>
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
        } else {
            newNode.Next = head;
            head = newNode;
        }
        System.out.println("Successfully Node added at Beginning");
        size++;
    }

    // << ---- addLast Operation ---- >>
    public void addLast(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.Next != null) {
                currentNode = currentNode.Next;
            }
            currentNode.Next = newNode;
        }
        size++;
    }

    // << ---- removeFirst Operation ---- >>
    public void removeFirst() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        head = head.Next;
        size--;
    }

    // << ---- removeLast Operation ---- >>
    public void removeLast() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
            return;
        } else if (head.Next == null) {
            head = null;
        } else {
            Node firstLastNode = head;
            Node lastNode = head.Next;
            while (lastNode.Next != null) {
                firstLastNode = firstLastNode.Next;
                lastNode = lastNode.Next;
            }
            firstLastNode.Next = null;
        }
        size--;
    }

    // << ---- printLinkedList Operation ---- >>
    public void printLinkedList() {
        if (head == null) {
            System.out.println("Sorry LinkedList Is Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.Data + " -> ");
            currentNode = currentNode.Next;
        }
        System.out.println("null");
    }

    // << ---- middleElementFinder Operation ---- >>
    public void middleElementFinder(){
    if (head == null) {
        System.out.println("LinkedList Is Empty");
        return;
    }
    Node slowPointer = head;
    Node fastPointer = head;
    while (fastPointer != null && fastPointer.Next != null) {
        slowPointer = slowPointer.Next;
        fastPointer = fastPointer.Next.Next;
    }
    System.out.println("The Middle Element is : " + slowPointer.Data);
}

 // << ---- printLinkedListSize Operation ---- >>
    public void printLinkedListSize() {
        System.out.println("The Number Of Node Is : " + size);
    }
}



// << ---- FinalLinkedListWithAllOperations Main Class ---- >>
public class FinalLinkedListWithAllOperations {
    public static void main(String args[]) {
        LinkedList linkedListObject = new LinkedList();

        linkedListObject.addFirst(11);
        linkedListObject.addLast(22);
        linkedListObject.addLast(33);
        linkedListObject.addFirst(44);
        linkedListObject.addLast(55);
        linkedListObject.addFirst(66);
        linkedListObject.addLast(77);
         linkedListObject.addLast(88);

        linkedListObject.removeFirst();
        // linkedListObject.removeLast();

        linkedListObject.printLinkedListSize();

        linkedListObject.middleElementFinder();

        linkedListObject.printLinkedList();
    }
}
