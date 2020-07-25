import java.util.Scanner;

public class TrainPassangerRunner {

	public static void main(String[] args) {
	   char response = 'y';
	   
	   Scanner s1 = new Scanner(System.in);
	   do {
		   System.out.println("Enter Passanger Name:");
		   String name = s1.nextLine();
		   System.out.println("Enter Passanger age");
		   String Strange = s1.nextLine();
		   int age = Integer.parseInt(Strange);
		   System.out.println("Enter passanger gender (M/F):");
		   String gen =s1.nextLine();
		   TrainPassanger tp1 = new TrainPassanger(name,age,(char)(gen.charAt(0)));
		   System.out.println("A new passange was created");
		   System.out.println("Name:"+ tp1.getname());
		   System.out.println("Age:" + tp1.getAge());
		   System.out.println("pnr: "+ tp1.getPnr());
		   System.out.println("Do you want to add another passanger? (y/n)");
		   response = s1.nextLine().charAt(0);
		   
	   }while(response=='y');
	   s1.close();

	}

}
