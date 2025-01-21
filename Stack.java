import java.util.Scanner;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        stackArray[++top] = j;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();
        Stack stack = new Stack(n);
        char ch;
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check whether the stack is empty");
            System.out.println("5. check whether the stack is full");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to be pushed:");
                    stack.push(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Popped Element = " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top Element = " + stack.peek());
                    break;
                case 4:
                    System.out.println("Empty status = " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Full status = " + stack.isFull());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            stack.display();
            System.out.println("\nDo you want to continue (Type Y or N) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        scan.close();
    }

    public void display() {
        System.out.print("\nStack = ");
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
        } else
            System.out.println("Stack is empty");
    }
}
