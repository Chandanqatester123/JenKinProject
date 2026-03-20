package Baseclasses;

import java.util.Scanner;

public class InterView {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a String ");
		String s=sc.nextLine();
		
		String Reverse_Words="";
		
		String[] split=s.split(" ");
		for(int i=split.length-1; i>=0; i--)
		{
			Reverse_Words=Reverse_Words+ split[i]+" ";
		}
		
		System.out.println(Reverse_Words);
			
		String Arr[]=new String[4];
		sc.nextLine();
		
		for (int i=0;i<Arr.length-1;i++)
		{
			Arr[i]=sc.nextLine();
		}
		System.out.println("Enter the search element");
		String Search=sc.nextLine();
		String get=Arr[0];
		String notget=Arr[0];
		
		for (int i=0; i<Arr.length-1; i++)
		{
			if(Search.equals(Arr[i]))
			{
				get=Search;
			}
			else
			{
				notget=Search;
			}
		}
		if(Search.equals(get))
		{
			System.out.println(get + "  Element is present");
		}
		else
		{
			System.out.println(notget+"  Element is not present");
		}
}}