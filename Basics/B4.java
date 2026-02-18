package Basics;

public class B4 {
  //functions
  public  static void greet(){
    System.out.println("Hello Man");
    System.out.println("Hello Man");
    System.out.println("Hello Man");
    return;
  }

public static int sum(int a,int b){
    return a+b;
}

public static int fact(int n){
    int fct = 1;
    for(int i=1 ; i<=n ; i++){
        fct *= i ;
    }
    return fct;
}
// public static void main(String[] args) {
//     int c = sum(8,6);
//     System.out.println(c);
// }



//call by value
 public static void swap(int a,int b){
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a: "+a);
    System.out.println("b: "+b);
 }

//  public static void binomialcoeff(int n,int r){
//     int a = fact(n);
//     int b = fact(r);
//     int c = fact(n-r);
//     int coeff = a/(b*c) ;
//     System.out.println(coeff);

//  }
// //     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
    
//         swap(a,b); //calling by value
    
//         System.out.println("a: "+a);
//         System.out.println("b: "+b);
//     }

public static void change(int a) {
    a = 10;
    System.out.println(a);
}
public static void main(String[] args) {
    int a = 5;
    change(a);
    System.out.println(a);
}




}
