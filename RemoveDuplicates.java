package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str1="PayPal India";
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for(int i=0;i<str1.length();i++)
		{
			
			Boolean result=charSet.add(str1.charAt(i));
			if(result.equals(true))
			{
				charSet.add(str1.charAt(i));
				System.out.println(charSet);
			}
			else
			{
				dupCharSet.add(str1.charAt(i));
				
			}
			
		}
		System.out.println();
		System.out.println("The Duplicates are :"+dupCharSet);
		
		
	}

}
