package Baseclasses;

import java.util.Scanner;

public class InterView {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Array size");
		int Size=sc.nextInt();
		
		String s[]=new String[Size];
		sc.nextLine();
		System.out.println("Enter the Array Element");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
			
		}
		System.out.println("Enter the Name Which you wants to search");
		String Search_Name=sc.nextLine();
		String found=s[0];
		String not_found=s[0];
		
		for (int i=0;i<s.length;i++)
		{
			if(s[i].equals(Search_Name))
			{
				found=s[i];
			}
			else
			{
				not_found=s[i];
			}
		}
		if(found.equals(Search_Name))
		{
			System.out.println(Search_Name+"  The name is present in the Array");
		}
		else
		{
			System.out.println(Search_Name+"  This name is not available");
		}
			
}}