package oopsdemo;

import java.util.Arrays;

 public class Practice1 {
    String name;
    int empid;
    double salary;
    void display(){
            System.out.println(name+" "+empid+" "+salary);
        }
         Practice1(String name,int empid,double salary){
            this.name=name;
            this.empid=empid;
            this.salary=salary;
        }
    public static void main(String[] args) {
        Practice1 obj = new Practice1("rakesh",101,1250.5);
        obj.display();
    }
    }
//    public static void main(String[] args) {
//       int [] arr = {1,2,5,6,9,6,7,8,0};
////       int min = arr[0];
////       int max = arr[0];
//       Arrays.sort(arr);
//       for (int i =0;i<arr.length;i++) {
//           System.out.print(arr[i]);

//           if (arr[i] < min) {
//               min = arr[i];
//           }
//           if (arr[i] > max) {
//               max = arr[i];
//           }
//
//       }
//        System.out.println();
//       int max = arr[0];
//       for (int i=0;i<arr.length;i++){
//           if (arr[i]>max){
//               max = arr[i];
//           }
//
//        }
//        System.out.print(max);
//
////        System.out.print("smallest:"+min+"  largest:"+max);
//        int num=12345;
//        int reverse = 0;
//        while (num!=0){
//            int remainder = num % 10;
//            reverse = reverse * 10 + remainder;
//            num = num / 10;
//        }
//        System.out.println("reverse number is:"+reverse);
//        int [] arr = {1,2,3,4,5,6,7};
//        int result = 0;
//        for (int i = 0;i<arr.length;i++){
//            result = result + arr[i];
//            System.out.println(result);
//        }



