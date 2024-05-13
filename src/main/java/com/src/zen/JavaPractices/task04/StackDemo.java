package com.src.zen.JavaPractices.task04;

import java.util.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    private Stack<Integer> stack;

    public StackDemo() {
        stack = new Stack<>();
    }

    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed to stack.");
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            Integer element = stack.pop();
            System.out.println(element + " popped from stack.");
        } else {
            System.out.println("Stack is empty, cannot pop.");
        }
    }

    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is currently empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackDemo stackDemo = new StackDemo();
        int choice;
        do {
            System.out.println("\n1. Push to stack");
            System.out.println("2. Pop from stack");
            System.out.println("3. Check if stack is empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integer to push: ");
                    int num = scanner.nextInt();
                    stackDemo.pushElement(num);
                    break;
                case 2:
                    stackDemo.popElement();
                    break;
                case 3:
                    stackDemo.checkIfEmpty();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please enter 1-4.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
