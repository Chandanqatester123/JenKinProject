package Baseclasses;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterView {	
	public static void main(String[] args)
	{
		int a=2;
		int b=3;
		int c=4;
		int d=++a + ++b + ++c + ++a + a+ b+c + ++c;
		System.out.println(d);
//		     =3+4+5+4+4+4+5+6;
	}
	
	
	
}