package com.org.Algaritham;
import java.util.*;
public class insertion1 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the array elements are");
		int n=s1.nextInt();
        System.out.println("enter the " +n+ "array elements are" );
        int[] jag=new int[n];
        for(int i=0;i<jag.length;i++) {
        	jag[i]=s1.nextInt();
        	
        }
        for(int i=1;i<jag.length;i++) 
        {
        	int key=jag[i];
        int j=i-1;
        while(j>=0&&jag[j]>key){
        	jag[j+1]=jag[j];
        j=j-1;
        
        
        }
        jag[j+1]=key;
        }
        System.out.println("after insertion sorting");
        for(int i=0;i<jag.length;i++)
        
        {System.out.println(+jag[i]);
        	
        }
        }
        
        
		}


