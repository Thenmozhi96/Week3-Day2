package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List <String> input1=new ArrayList<String>();
		for(String listing : input)
		{
			input1.add(listing);
		}
		System.out.println("The given List of array :");
		System.out.println(input1);
		System.out.println();
		System.out.println("After Sorting :");
		Collections.sort(input1);
		System.out.println(input1);
		System.out.println();
		System.out.println("Rever order of the Sorted Array: ");
		Collections.reverse(input1);
		System.out.println(input1);
	}

}
