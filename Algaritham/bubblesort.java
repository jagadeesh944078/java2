package com.org.Algaritham;
import java.util.*;
public class bubblesort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
              //  int arr[] ={3,60,35,2,45,320,5};  
    	Scanner s1=new Scanner(System.in);
    	
    	
                 
                System.out.println("no of elements");
                int i=s1.nextInt();
                int[] ar=new int[i];
                System.out.println("Array Before Bubble Sort");
                for( i=0;i<ar.length;i++) {
                	ar[i]=s1.nextInt();
                }
               // for(i=0; i < ar.length; i++){  
                 //       System.out.print(ar[i] + " ");  
                //}  
                System.out.println();  
                  
                bubbleSort(ar);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for( i=0; i < ar.length; i++){  
                        System.out.print(ar[i] + " ");  
                }  
   
        }  
}  