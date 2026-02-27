package Java_Programms_Practice;

import java.util.Scanner;

public class String_Class {
	static Scanner sc=new Scanner(System .in);
	public void Fin_Largest_Array()
	{
		System.out.println("Eneter teh Array Size");
		int Size=sc.nextInt();
		
	}
	
	public void Swap_Number_Withoutusing_ThirdNo()
	{
		int a =2;
		int b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"_"+b);
	}
	public static void main(String[] args) {
		
		String_Class s=new String_Class();
		s.Swap_Number_Withoutusing_ThirdNo();
		
		
		System.out.println("Enter the String Keyword to Reverse");
		String Original=sc.next();
		
		String Reverse="";
		
		for (int i=Original.length()-1; i>=0; i--)
		{
			Reverse=Reverse+Original.charAt(i);
			
		}
		System.out.println(Reverse);
		System.out.println("Chandanuu");
		
		if(Original.equals(Reverse))
		{
			System.out.println("It's a Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
