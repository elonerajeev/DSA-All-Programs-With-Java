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
public class Traversing_of_a_element_in_the_stack_in_java {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Traversing elements in the stack:");
        traverseStack(stack);
    }

    public static void traverseStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int element = stack.pop();
            tempStack.push(element);
            System.out.println(element);
        }
        // Restoring the elements back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

