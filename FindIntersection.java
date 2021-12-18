package week3.day2;
import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) { 
	int arr1[]={3,2,11,4,6,7};
	int arr2[]={1,2,8,4,9,7};
	List<Integer> list1=new ArrayList<Integer>();
	for(Integer con1:arr1)
	{
		list1.add(con1);
		
	}
	List<Integer> list2=new ArrayList<Integer>();
	for(Integer con2:arr2)
	{
		list2.add(con2);
		
	}
	for(int i=0;i<list1.size();i++)
	{
		if((list1.get(i))==(list2.get(i)))
		{
			System.out.println("The intersection of Array1 and Array2 is: "+list1.get(i));
		}
		else
		{
			continue;
		}
	}
	}

}
