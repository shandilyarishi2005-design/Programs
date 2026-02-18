package Basics;
import java.util.*;

public class B5 {
   
        //function overloading using parameters
        // public static int sum(int a,int b){
        //     return a+b;
        // }
        // public static int sum(int a,int b, int c){
        //     return a+b+c;
        // }
        // public static void main(String[] args) {
        //     System.out.println(sum(3,5));
        //     System.out.println(sum(3,5,6));
        // }



        //funcion overloading using data type
        // public static int sum(int a, int b){
        //     return a + b;
        // }
        // public static float sum(float a, float b){
        //     return a + b;
        // }
        public static void main(String[] args) {
        //     System.out.println(sum(3,5));
        //     System.out.println(sum(3.5f,5.2f));
        // }




        //binary to decimal
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your binary number");
        // int bin = sc.nextInt();
        // int sum = 0;
        // int i = 0;
        // while(bin>0){
        //     int dig = bin%10;
            
        //     sum = sum +(dig * (int)Math.pow(2,i));
        //     bin /= 10;
        //     i++;
        // }
        // System.out.println(sum);



        //decimal to binary
        System.out.print("Enter your num : ");
        int dec = sc.nextInt();
        int pow = 0;
        int bin = 0;;
        while(dec>0){
            int rem = dec%2;
            bin = bin + rem*(int)Math.pow(10,pow);
            pow++;
            dec = dec/2;

        }
        System.out.println(bin);

}
}