package oopsdemo;

public class MethodOverloading {
    public static int addition(int a,int b){
        return a+b;
    }
    public static int addition(int a,int b,int c){
        return a+b+c;
    }
    public static double addition(double a,double b,double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(addition(4,5));
        System.out.println(addition(2,4.5,5.0));
        System.out.println(addition(4,5,6));
    }
}
