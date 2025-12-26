class sum{
    
    // int a;
    // String b;
    // float c;
    
    int sumoftwo(int a, int b) {
        int c=a+b;
        return c;
    }
}
class Main {
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        sum a = new sum();
        int result=a.sumoftwo(40,20);
         System.out.println("result = " +result);
    }
}
