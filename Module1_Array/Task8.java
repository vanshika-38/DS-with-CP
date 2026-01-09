class Node{
   private int data;
    Node next;
    
    Node(int a){
        data=a;
        next=null;
        
    }
    public void getdata(){
        System.out.println(data);
    }
    public void getref(){
        System.out.println(next);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Vanshika singh");
        Node a =new Node(30);
        
        Node  b=new Node(38);
        a.getdata();
        
        
        a.next=b;
        
        a.getref();
        System.out.println(a);
        System.out.println(b);
    }
}
