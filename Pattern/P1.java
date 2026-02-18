package Pattern;

public class P1 {
    public static void main(String[] args) {
     //pattern 1
    //   for(int i = 1; i<=4; i++){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //   }  


    //Pattern 2
    // for(int i =4; i>=1; i--){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }


    //Pattern 3
    //for(int i=1; i<=4; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(j+" ");

    //     }
    //     System.out.println();
    // }



    //Pattern 4
    char ch =  'A';
    for(int i=1; i<=4; i++){
        for(int j=1;j<=i; j++){
            System.out.print(ch +" ");
            ch++;
        }
        System.out.println();
    }




    }
    
}
