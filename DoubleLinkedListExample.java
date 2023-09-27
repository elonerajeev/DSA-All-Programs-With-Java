class Node {
    int data;
    Node nextNode;
    Node previouNode;
}
public class DoubleLinkedListExample {
    public static void main (String arsg[]){
        Node head = new Node();
        head.data = 100;

        Node secondElement = new Node();
        secondElement.data = 200;

        Node thirdElement = new Node();
        thirdElement.data = 300;

        head.previouNode = null;
        head.nextNode = secondElement;


        secondElement.previouNode = head;
        secondElement.nextNode = thirdElement;

        thirdElement.previouNode = secondElement;
        thirdElement.nextNode = null;
        
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.nextNode;
            System.out.print(current.nextNode + " --> ");
        }
        System.out.println("null");
    }
}
