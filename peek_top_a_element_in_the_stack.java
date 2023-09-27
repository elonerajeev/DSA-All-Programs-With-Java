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
public class peek_top_a_element_in_the_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element in the stack: " + topElement);
    }
}
