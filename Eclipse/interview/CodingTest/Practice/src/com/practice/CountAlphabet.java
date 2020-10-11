package com.practice;

public class CountAlphabet 
{
public static void main(String[] args) 
{
	String s = "akash jena  sgh jjjj ";
		/*
		 * String ss = s.replaceAll("\\s", ""); System.out.println(ss);
		 */
	char[] arr = s.toCharArray();
	//System.out.println(arr);
	int j=1;
	for(int i=0; i<arr.length; i++)
		if(arr[i] != ' ')
		{
			System.out.println(arr[i] + "  "+j);
			j++;
		}
}
}
