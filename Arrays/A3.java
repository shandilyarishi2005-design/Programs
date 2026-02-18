package Arrays;
import java.util.*;

public class A3 {
    //subarray
    public static void subarray(int a[]){
        for(int i = 0; i<a.length ;i++){
            int  m = i;
            for(int j =i+1;j<a.length;j++){
                int n = j;
                for(int k = m;k<n;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }


   //max subarray sum
   public static void max_subarray_sum(int a[]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            int sum = 0;
            for(int k=i;k<=j;k++){
                sum += a[k];

            }
            
            if(sum>max){
                max = sum;
            }
        }
        
    }
    System.out.println("max sum = "+max);
   }


   //min subarray sum
    public static void min_subarray_sum(int a[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += a[k];

                }
                
                if(sum<min){
                    min = sum;
                }
            }
            
        }
        System.out.println("min sum = "+min);
       }


       // max subarray using prefix sum
         public static void max_subarray_sum_prefix(int a[]){
          int max=Integer.MIN_VALUE;
          int prefix[] = new int[a.length];
            prefix[0] = a[0];
            for(int i=1;i<a.length;i++){
                prefix[i] = prefix[i-1]+a[i];
            }
            
            for(int i=0;i<a.length;i++){
                for(int j=i;j<a.length;j++){
                    int sum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                    if(sum>max){
                        max = sum;
                    }
                }
            }
            System.out.println("max sum using prefix = "+max);

            }


          

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        max_subarray_sum(a);
        min_subarray_sum(a);
        max_subarray_sum_prefix(a);
        



    }
}
