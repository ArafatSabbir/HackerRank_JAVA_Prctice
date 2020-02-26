import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arraySize=sc.nextInt();
        int[] arr= new int[arraySize];
        
        for(int i=0;i<arraySize;i++){
        arr[i]=sc.nextInt();
        }


        int count=0;
        for(int j=0;j<arraySize;j++){
            int sum=0;
            for(int k=j;k<arraySize;k++){
                sum=arr[k]+sum;
                if(sum<0){
                count++;
            }
        }
    }

    System.out.println(count);
       
    }
}
