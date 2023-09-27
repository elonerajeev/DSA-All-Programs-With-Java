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
import java.util.Scanner;
public class insert_a_element_in_the_stack {
    public static void main(String[] args) {
        Scanner scane = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Insert an element into the stack
        int elementToInsert = 25;
        stack.push(elementToInsert);
        
        //Input taking by the user 
        System.out.println("ENter the input for unserting : ");
        int num1 = scane.nextInt();
        stack.push(num1);

        // Print the stack after insertion
        System.out.println("Stack elements after insertion:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

