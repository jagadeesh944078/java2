package com.org.Algaritham;
import java.util.*;

public class primenumbers {
	public static void main(String[] args)
	{
		for(int i=1;i<1000;i++) {
			int k=0;
			for(int j=2;j<i;j++) {
			
				if(i%j==0) {
				k=1;
				break;
					
				}}
				
				if(k==0) {
					System.out.println(i);
				}
				
			}
		}
	}


