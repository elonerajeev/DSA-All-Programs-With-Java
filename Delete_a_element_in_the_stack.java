/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajeev kumar
 */
import java.util.Stack;
public class Delete_a_element_in_the_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Delete an element from the stack
        deleteElement(stack, 20);

        // Print the remaining elements in the stack
        System.out.println("Remaining elements in the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void deleteElement(Stack<Integer> stack, int element) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current != element) {
                tempStack.push(current);
            }
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
