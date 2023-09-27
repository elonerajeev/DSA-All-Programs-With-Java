import java.util.ArrayList;
import java.util.List;

class StackClass {
    int top;
    int sizeOfStack = 10;
    int[] array = new int[sizeOfStack];

    StackClass() {
        this.top = -1;
    }

    public void push(int element) {
        if (top < sizeOfStack - 1) {
            top++;
            array[top] = element;
        } else {
            System.out.println("Stack Overflow: Unable to push " + element);
        }
    }

    public int pop() {
        if (top >= 0) {
            int element = array[top];
            top--;
            return element;
        } else {
            System.out.println("Stack Underflow: Unable to pop");
            return -1; // You can choose a different value to indicate an error
        }
    }
}

public class ReverseOfStack {
    public static void main(String args[]) {
        StackClass stack = new StackClass();
        stack.push(1000);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        List<Integer> array1 = new ArrayList<>();

        while (stack.top >= 0) {
            int poppedElement = stack.pop();
            array1.add(poppedElement);
        }

        // Printing the reversed elements
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i));
        }
    }
}
