package Java_Programms_Practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_java {
	public static void main(String[] args) 
	{
		 String str = "Google";

	        for (int i = 0; i < str.length(); i++) {
	            int count = 0;

	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    count++;
	                }
	            }
	            if (count > 1 && str.indexOf(str.charAt(i)) == i) {
	                System.out.println(str.charAt(i));
	            }
	        }
	}
}