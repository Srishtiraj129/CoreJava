package basic;

import java.util.Scanner;

public class ConvertToInt {

	public static void main(String[] args) {
		System.out.println("Enter a float value");
		Scanner s1 = new Scanner(System.in);
		float input = s1.nextFloat();
		int i = (int)input;
		System.out.println("Converted float to int:"+ i);
		s1.close();
	   
		
		

	}

}
