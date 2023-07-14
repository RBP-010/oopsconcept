package oopsdemo;

abstract class Abstraction {
    abstract void display();
}
class ClassA extends Abstraction {
    public void display(){
        System.out.println("this is a parent class method");
    }

    public static void main(String[] args) {
        Abstraction object = new ClassA();
        object.display();
    }
}
