package Java_Programms_Practice;

import java.util.Scanner;

public class String_Class {
	static Scanner sc=new Scanner(System .in);

	public void Find_Largest_Array()
	{
		System.out.println("Eneter teh Array Size");
		int Size=sc.nextInt();
		int a[]=new int[Size];
		
		System.out.println("Enter Arry Elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		
		for (int i=0; i<a.length; i++)
		{
			if (max<a[i])
			{
				max=a[i];
			}
			else if(min >a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Smallest Number= "+max);
		System.out.println("Largesdt Number= "+min);
		
		
	}
	
//	Find Second Largest No in Array
	public void Second_Largest_no()
	{
		System.out.println("Eneter the Array Size");
		int Size=sc.nextInt();
		int a[]=new int[Size];
		
		System.out.println("Enter Arry Elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int Largest=Integer.MIN_VALUE;
		int Second_Largest=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>Largest)
			{
				Second_Largest=Largest;
				Largest=a[i];
			}
			else
			{
				System.out.println("There is no Largest No");
			}
		}
		System.out.println("The Second largest No is:- "+ Second_Largest);
	}
	
//	Split the words and Reverse the words
	public void Reverse_Words()
	{
//		| Code       | Meaning               |
//		| split("")  | Split into characters |
//		| split(" ") | Split into words      |
//		| charAt(i)  | Access one character  |
//		| next()     | Reads one word        |
//		| nextLine() | Reads full sentence   |

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String");
		String Sentence=sc.nextLine();
		
		String[] Split_Words=Sentence.split(" ");
		String Word_Reverse="";
		for (int i=Split_Words.length-1; i>=0; i-- )
		{
			Word_Reverse=Word_Reverse+Split_Words[i]+" ";
		}
		System.out.println(Word_Reverse.trim());
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
		s.Find_Largest_Array();
		s.Reverse_Words();
		
		
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
