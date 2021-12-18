package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondHighestOccuranceCharacter {

	public static void main(String[] args) {
		String str="PayPal India";
		char str2[]=str.toCharArray();
		Map<Character,Integer> text=new LinkedHashMap<Character,Integer>();
		List<Object> list1=new ArrayList<Object>();
		for(Character ch:str2)
		{	
			if(text.containsKey(ch))
			{
				text.put(ch, text.get(ch)+1);
				
			}
			else
			{
				text.put(ch, 1);
				
			}
		}
		
		System.out.println(text);	
		List<Integer> list2=new ArrayList<Integer>(text.values());
		Collections.sort(list2);
		//System.out.println(list2);
		System.out.println(list2.get(list2.size()-2));
		//System.out.println(text.get((text.values() == 2)));

	}

}
