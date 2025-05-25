package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;

    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            String element = stack.pop();  // Saca y devuelve el elemento en la cima
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        Stack<String> myStack = createStack();
        System.out.println("Elemento en la cima de la pila: " + myStack.peek());  // Muestra el elemento cima sin sacarlo
        System.out.println("\nVaciando la pila y mostrando elementos:");
        printAndEmptyStack(myStack);
    }



}
