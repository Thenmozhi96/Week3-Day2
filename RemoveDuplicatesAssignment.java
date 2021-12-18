package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesAssignment 
{
	public static void main(String[] args)
	{
	String text ="We learn java basics as part of java sessions in java week1";
	String str1[]=text.split(" ");
	Set<String> str2=new LinkedHashSet<String>();
	for (String str3:str1)
	{
		str2.add(str3);
		
	}
	System.out.println(str2);
	}
}