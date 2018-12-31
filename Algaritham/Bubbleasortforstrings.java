package com.org.Algaritham;

 
import java.util.*;
public class Bubbleasortforstrings {

     

    public static void main(String[] args) {
       // String list[]={"Drtichoke" , "Apple" , "CHERRY" , "Eanana"};
    	Scanner s1=new Scanner(System.in);
    	
    	
        
        System.out.println("no of elements");
        int i=s1.nextInt();
        String[] list=new String[i];
        System.out.println("Array Before Bubble Sort");
        for( i=0;i<list.length;i++) {
        	list[i]=s1.nextLine();
        }

    	
    	
        
    	
        BubbleSort(list);

        for( i=0; i<list.length; i++)
        {
        	System.out.println(list[i]);

        }

    }

     

    private static void BubbleSort(String[] array) {

        String temp;

    

        for(int i=0; i<array.length; i++) {

        

            for(int j=0; j<array.length-1-i; j++) {

            

            if(array[j].compareTo(array[j+1])>0) {
               temp = array[j];

                array[j] = array[j+1];

                array[j+1] = temp;
            }
        }

        }
    }

}
