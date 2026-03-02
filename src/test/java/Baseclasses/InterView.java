package Baseclasses;

import java.util.Scanner;

public class InterView {
	public static void main(String[] args) {
//		| Code         | Meaning               |
//		| ------------ | --------------------- |
//		| `split("")`  | Split into characters |
//		| `split(" ")` | Split into words      |
//		| `charAt(i)`  | Access one character  |
//		| `next()`     | Reads one word        |
//		| `nextLine()` | Reads full sentence   |

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

}
