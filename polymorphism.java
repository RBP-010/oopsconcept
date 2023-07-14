package oopsdemo;

public class polymorphism {
    String name = "seema";
    public void display(){
        System.out.println("this is a parent class method");
    }
}
class Child extends polymorphism{
    void disply(){
        super.display();
        System.out.println("child class method..");
        System.out.println(super.name);
    }
}
