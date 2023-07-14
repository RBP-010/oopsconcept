package oopsdemo;

public interface Interface1 {
    void demo();
}
class Demo1 implements Interface1 {
    public void demo(){
        System.out.println("Hello interface");
    }

    public static void main(String[] args) {
        Interface1 object = new Demo1();
        object.demo();
    }
}
