// // push 
// // pop
// // peek
// // size
// // isEmpty
// import java.util.*;

// public class Stackds {
//     public static void main(String[] args) {
//       Stack<Integer> stack = new Stack<>();

//         stack.push(1);  
//         stack.push(2);  
//         stack.push(3);  

//         System.out.println("Top element: " + stack.peek());  
//         System.out.println("Stack size: " + stack.size());   
        
//         System.out.println("Popped element: " + stack.pop());  
//         System.out.println("Popped element: " + stack.pop());  

//         System.out.println("Stack size after popping: " + stack.size()); 
//         System.out.println("Top element after popping: " + stack.peek());
//         System.out.println("Is Stack Empty: " + stack.isEmpty());

//     }
// }

class Stackds{
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        System.out.println("Top Element: " + s.peek());
        s.display();
    }
}
class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        // [1,2,3,0,0] top = 1
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}