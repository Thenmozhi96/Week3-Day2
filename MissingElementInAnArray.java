package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> list1=new ArrayList<Integer>();
		for (Integer li:arr) 
		{
			list1.add(li);
		}
		Collections.sort(list1);
		System.out.println("The given List of elemets are:  "+list1);
		for(int i=0,j=1;i<=list1.size()-1;i++,j++)
		{
			if((list1.get(i))==j)
			{
				continue;
			}
			else 
			{
			System.out.println("the Missing Element is: "+j);
			i=i+2;
			}
		}
	}

}
