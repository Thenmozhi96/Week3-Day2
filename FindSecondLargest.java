package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		List<Integer> list1=new ArrayList<Integer>();
		for(Integer values:data)
		{
			list1.add(values);
		}
		Collections.sort(list1);
		System.out.println(list1.get(list1.size()-2));
	}

}
