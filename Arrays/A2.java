package Arrays;
import java.util.*;

public class A2 {
    public static int lin_search(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static int largest(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        return largest;


    } 
    
    
    public static int binsearch(int a[], int key){
        int low=0;
        int high = a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(key==a[mid]){
                return mid;
            }
            else if(key<a[mid]){
                low=mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return -1;
    }



    public static void reverse(int a[]){
       int f = 0;
       int l = a.length-1;
       while(f<=l){
        int temp = a[f];
        a[f] = a[l];
        a[l] = temp;
        f++;
        l--;
       }
       for(int i =0;i<a.length;i++){
        System.out.println(a[i]);
       }
        
    }



    //pairs in an array
    public static void pairs(int a[]){
        for(int i=0;i<a.length;i++){
            int curr = a[i];
            for(int j=i+1;j<a.length;j++){
                System.out.println("("+curr+" , "+a[j]+")");
            }

        }
    }



    public static void main(String[] args) {
        //linear search
        int m[] = {26,89,56,54,24};
        /*/int k = lin_search(m, 54);
        if(k==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at index "+k);
        }*/

        // 2 .  System.out.println(largest(m));
        //3. System.out.println(binsearch(m, 37));
    reverse(m);
    pairs(m);
    }
    
}
