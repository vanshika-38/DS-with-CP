class BST{
    Node root;
    
    
    boolean searchinBST(int key,Node root){
        Node curr=root;
        while(curr!=null){
            if(key==curr.d){
                return true;
            }else if(key>curr.d){
                curr=curr.r;
            }else{
                curr=curr.l;
            }
        }
        return false;
    }
    
    
    void insertBST(int key,Node root){
        Node curr=root;
        Node p=null;
        while(curr!=null){
            p=curr;
             if(key>curr.d){
                curr=curr.r;
            }else{
                curr=curr.l;
            }
        }
        //attach
        Node nn = new Node(key);
        
        if(key<p.d){
            p.l=nn;
        }else{
           p.r=nn; 
        }
        
    }
    
    void inorder(Node root){
        //base condition
        if(root!=null) {
            inorder(root.l);
         System.out.print(root.d + " ");
         inorder(root.r);
        }
    }
}

class Node{
        int d;
        Node l,r;
        // constructor
        Node(int d){
            this.d=d;
            this.l=this.r=null;
        }
    }


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        BST t=new BST();
        
        Node a=new Node(40);
        Node b=new Node(20);
        Node c=new Node(60);
        Node d=new Node(15);
        Node e=new Node(30);
        Node f=new Node(50);
        Node g=new Node(70);
        Node h=new Node(10);
        
        //linking
        a.l=b;// root
        a.r=c;
        b.l=d;
        b.r=e;
        c.l=f;
        c.r=g;
        d.l=h;
        
        System.out.println(t.searchinBST(10,a));
        
        t.inorder(a);
         t.insertBST(55,a);
         System.out.println();
        t.inorder(a); 
        
        
    }
