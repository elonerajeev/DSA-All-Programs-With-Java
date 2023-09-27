class Node {
    int data;
    Node next;
}

public class SinglyLinkedListExample {
    public static void main(String args[]) {
        // Create the head node
        Node head = new Node();
        head.data = 100;

        // Create other nodes
        Node secondElement = new Node();
        secondElement.data = 200;

        Node thirdElement = new Node();
        thirdElement.data = 300;

        Node fourthElement = new Node();
        fourthElement.data = 400;

        Node fifthElement = new Node();
        fifthElement.data = 500;

        Node sixthElement = new Node();
        sixthElement.data = 600;

        // Link the nodes together
        head.next = secondElement;
        secondElement.next = thirdElement;
        thirdElement.next = fourthElement;
        fourthElement.next = fifthElement;
        fifthElement.next = sixthElement;
        sixthElement.next = null;

        // Initialize the current pointer to the head
        Node current = head;

        // Traverse and print the linked list
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next; // Move to the next node
            System.out.print(current.next + "-->");

        }
    }
}
