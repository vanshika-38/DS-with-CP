class Stack {
    int[] arr;
    int top;

    Stack(int a) {
        arr = new int[a];
        top = -1;
    }

    public void append(int a) {
        if (top == arr.length-1) {
            System.out.println("Stack will overflow");
            return;
        }
        arr[++top] = a;
    }

    public void pop() {
        if (top == -1) {
            System.out.println( "Stack is empty");
            return;
        }
        arr[top] = 0;
        top--;
    }
}

class Main {
    public static void main(String[] args) {
        Stack s = new Stack(4);
        s.append(50);
        s.append(40);
        s.append(30);
        s.append(20);
        s.append(10);
        s.pop();
    }
}
