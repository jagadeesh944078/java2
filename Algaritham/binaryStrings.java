package com.org
.Algaritham;
import java.util.*;

public class binary {
public static void main(String[] args) {
	int first,last,search,middle;
	Scanner s1=new Scanner(System.in);
System.out.println("enter the array elements are");
int i=s1.nextInt();
System.out.println("enter" +i+ "array elements are");
int[]  array=new int[i];
for(int c=0;c<array.length;c++) {
array[c]=s1.nextInt();
}
System.out.println("enter the value to find");
search=s1.nextInt();
first=0;
last=i-1;
middle=first+last/2;
while(first<=last)
{
	if(array[middle]<search) {
		first=middle+1;
		
}
		else if(array[middle]==search)
		{
			System.out.println(+search+ "found at location"+(middle+1)+ ".");
			break;
		}
		else {
			last=middle-1;
			middle=(first+last)/2;
			
			
			}
		if(first>last) {
			System.out.println(+search+ "is not present in the list");
		}
	}



}


}
