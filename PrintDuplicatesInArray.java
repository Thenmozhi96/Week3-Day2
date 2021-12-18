package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> list1=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(list1.add(arr[i])==true)
			{
				list1.add(arr[i]);
				
			}
			else
			{
				
				System.out.println("The Duplicate values are: " +arr[i]);
			}
			
		}
		System.out.println();
		System.out.println("The List without Duplicate Values: "+list1);
		
	}

}
