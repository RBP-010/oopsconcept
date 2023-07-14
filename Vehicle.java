package oopsdemo;

public interface Vehicle {
    void start();
    void stop();
    class car implements Vehicle{
        public void start(){
            System.out.println("car started");
        }
        public void stop(){
            System.out.println("car stopped");

        }
    }

    public static void main(String[] args) {
        Vehicle object = new car();
        object.start();
        object.stop();
    }
}
