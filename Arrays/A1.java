package Arrays;
import java.util.*;


public class A1 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //operation on arrays
        //.create
        int marks[] =new int[5];
        int num[] = {1,2,3,5};
        System.out.println(num[3]);
        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }*/

        //len--->marks.length


        //PAssing arrays as argument
        public static void update(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i] += 1;

            }
        }
        public static void main(String[] args) {
            int apr[] = {24,26,28};
            update(apr);
            for(int i=0;i<apr.length;i++){
                System.out.println(apr[i]);
            }
        }



    }

