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

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String[] split=s.split(" ");
		String Reverse="";
		for (int i=split.length-1; i>=0;i--)
		{
			Reverse=Reverse+ split[i]+" ";
		}
		System.out.println(Reverse);
	}

}
