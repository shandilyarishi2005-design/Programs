package Pattern;

public class P2 {
    public static void main(String[] args) {
     //hollow rectangle 
    //  * * * * * *
    //  *         *
    //  *         * 
    //  * * * * * * 
  /*for(int i = 1; i<=4; i++){
        for(int j = 1; j<=4;j++){
            if(i==1 || i==4 || j==1 || j==4){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");

            }

            
            
        }
        System.out.println();
    }  
    }*/



//inverted pyramid
//       *
//     * *
//   * * *
// * * * *

// for(int i = 1;i<=4; i++){
//     for(int j = 1; j<=4-i;j++){
        
//         System.out.print(" ");


//     }
//     for(int j = 1; j<=i;j++){
        
//         System.out.print("*");
//     }
//     System.out.println();
    
// }
//     }
// }


//inverted half pyramid
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2 
// 1

// for(int i = 5; i>=1; i--){
//     for(int j = 1 ; j<=i; j++){
//         System.out.print(j+" ");

//     }
//     System.out.println();

// }



/*floyds triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15*/
// int num =1;
// for(int i = 1; i <= 5; i++){
//     for(int j = 1; j<= i; j++){
//         System.out.print(num+" ");
//         num++;
//     }
//     System.out.println();

// }



// //0-1 pattern
// // 1
// // 0 1
// // 1 0 1
// // 0 1 0 1
// // 1 0 1 0 1

// for(int i = 1;i <=5 ; i++){
//     for(int j =1; j<=i; j++){
//         if((i+j)%2==0){
//             System.out.print("1 ");
//         }
//         else{
//             System.out.print("0 ");
//         }
//     }
//     System.out.println();
// }

/*Butterfly pattern
*      *
**    **
***  ***
********
********
***  ***
**    **
*      **/
//stars 2i
//space 2n-2i
for(int i =1;i<=4; i++){
    //stars
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
    //spaces
    for(int j =1;j<=(8-2*i);j++){
        System.out.print("  ");
    }
    //stars
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
    System.out.println();
}
for(int i =4;i>=1; i--){
    //stars
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
    //spaces
    for(int j =1;j<=(8-2*i);j++){
        System.out.print("  ");
    }
    //stars
    for(int j=1; j<=i; j++){
        System.out.print("* ");
    }
    System.out.println();
}



//solid rhombus
/*          * * * * *
        * * * * *
      * * * * * 
    * * * * * 
  * * * * *                 */


for(int i =1;i<=5;i++){
    //spaces
    for(int j=1;j<=5-i+1;j++){
        System.out.print("  ");
    }
    //stars
    for(int j=1;j<=5;j++){
        System.out.print("* ");
    }
    System.out.println();
}



//hollow rhombus
for(int i =1;i<=5;i++){
    //spaces
    for(int j=1;j<=5-i+1;j++){
        System.out.print("  ");
    }
    for(int j=1;j<=5;j++){
        if(i==1 || i==5 || j==1 || j==5){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
    
    }
    System.out.println();
    
}



//diamond pattern


for(int i=1;i<=10;i++){
    //spaces
    for(int j=1;j<=10-i;j++){
        System.out.print("  ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("* ");
    }
    System.out.println();
}
for(int i=10;i>=1;i--){
    //spaces
    for(int j=1;j<=10-i;j++){
        System.out.print("  ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("* ");
    }
    System.out.println();
}

}
}