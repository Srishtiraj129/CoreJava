package basic;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter y/n: ");
        char resp = s1.nextLine().charAt(0);
        if (resp == 'y') {
        	System.out.println("You entered YES!");
        }
        else {
        	System.out.println("You entered NO!");
        }
        
        s1.close();
	}

}
