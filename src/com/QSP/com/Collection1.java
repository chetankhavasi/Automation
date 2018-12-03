package com.QSP.com;


import java.util.ArrayList;
import java.util.List;

public class Collection1 
{

	public static void main(String[] args) 
	{
		List<String> al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("b");
		al.add(null);
		int count=al.size();
		System.out.println(count);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
        
		
		//for-each loop
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
