class student{
    String name;
    int age;
void getName(){
System.out.println(name);
}
void getAge(){
    System.out.println(age);
}
}
class Main {
    public static void main(String[] args) {
        
        //user define data types
        student a=new student();
        a.name="bhu";
        a.age=18;
        
        System.out.println(a.name);
        System.out.println(a.age);
        a.getName();
        a.getAge();
        
        student b=new student();
        b.name="palak";
        b.age=19;
        
        System.out.println(b.name);
        System.out.println(b.age);
        b.getName();
        b.getAge();
    }
}
