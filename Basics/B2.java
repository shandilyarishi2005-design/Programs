package Basics;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        
    //arithmatic opearator
//     int a=10;
//     int b=5;
//    int c=a+b;
//     System.out.println(c);
//     c=a-b;
//     System.out.println(c);
//     c=a*b;
//     System.out.println(c);
//     c=a/b;
//     System.out.println(c);
//     c=a%b;
//     System.out.println(c);

//Unary operator
// int a = 10;
// int b = ++a;
// System.out.println(b);
// System.out.println(a);
// int a = 10;
// int b = a++;
// System.out.println(b);
// System.out.println(a);


//logical operator
/*boolean x=((5>4) && (7<4));
    System.out.println(x);*/



//conditional statement
// int age = 23;
// if(age>18){
//     System.out.println("Can vote");
// }
// else{
//     System.out.println("cant vote");
// }
Scanner sc = new Scanner(System.in);
// System.out.print("Enter your number");
// int num = sc.nextInt();
// if(num%2==0)
//     System.out.println("Even");
// else
//     System.out.println("Odd");


//ternary operator
int num = sc.nextInt();
 System.out.println(((num%2==0)?"even":"odd"));

    }
}
