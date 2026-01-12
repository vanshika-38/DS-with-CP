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
     public void currstateStack(){
        System.out.println("top is at "+ top);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        
        return;
        
    }
}

class Main {
    public static void main(String[] args) {
        Stack s = new Stack(4);
        s.currstateStack();
        s.append(50);
        System.out.println("----After appending 50 -----");
        s.currstateStack();
        s.append(40);
        System.out.println("----After appending 40 -----");
        s.currstateStack();
        s.append(30);
        System.out.println("----After appending 30 -----");
        s.currstateStack();
        s.append(20);
        System.out.println("----After appending 20 -----");
        s.currstateStack();
       
        s.append(10);
        System.out.println("----After appending 10 -----");
        s.currstateStack();
        
        s.pop();
         System.out.println("----After pop operation-----");
        s.currstateStack();
    }
}
