package com.org.Algaritham;
import java.util.*;
public class java {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int[] arr=new int[26];
	System.out.println("enter the strings are");
	String s2=s1.nextLine();
	for(int i=0;i<s2.length();i++) {
	char ch=s2.charAt(i);
	if(ch>'A'&&ch<'Z') {
		System.out.println(arr[ch-65]++);
		
	}
}}
}
