package collections;

import java.util.Stack;

/**
 * A Stack is a Last In First Out (LIFO) data structure. It supports two basic operations called push and pop. 
 * 	The push operation adds an element at the top of the stack, and 
 * 	the pop operation removes an element from the top of the stack
 * @author user
 *
 * https://www.callicoder.com/java-stack/
 */
public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackOfCards = new Stack<>();

        // Pushing new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();

        // Popping items from the Stack. 
        //Pop removes the item also
        String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);

    }
}
