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
		
		String[] Slpit_words=Sentence.split(" ");
		String reverse_words="";
		for(int i=Slpit_words.length-1;i>=0; i--)
		{
			reverse_words=reverse_words+Slpit_words[i]+" ";
		}
		System.out.println(reverse_words);
	}

}
