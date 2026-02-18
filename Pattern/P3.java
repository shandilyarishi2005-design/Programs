package Pattern;

public class P3 {
    public static void main(String[] args) {
        
        //number pyramid
        for(int i=1;i<=5;i++){
            //spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }



     //palindromic pattern with numbers
     
     for(int i=1;i<=5;i++){
        //spaces
        for(int j=1;j<=5-i;j++){
            System.out.print("  ");
        }
        //decsending numbers
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        //ascending numbers
        for(int j = 2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }
    }
    
}
