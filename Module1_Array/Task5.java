class Student{   
    // data fields
    String name;
    int age;   
    // method
    void getName(){
        
        System.out.println(" My name is "+ name);
        
    }
    
    void getAge(){
        System.out.println(" My age is "+ age);
        
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        // S a= new S();
        
        // int result=a.sumoftwo(10,20);
        // System.out.println("result is "+ result);
        
        
        Student roll1=new Student();
        
        System.out.println(roll1);
        
        roll1.name="Vanshika Singh";
        roll1.age=20;
        
        roll1.getName(); 
         roll1.getAge();        
    }
}
