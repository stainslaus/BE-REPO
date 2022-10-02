package Experiment;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		float a,b,c;
		System.out.println("Division calculator");
		System.out.println("Enter the number below:");
		a = input.nextFloat();
		System.out.println("Enter the second number:");
		b = input.nextFloat();
		c = a/b;
		System.out.println("The result is:"+c);
		input.close();
	}

}