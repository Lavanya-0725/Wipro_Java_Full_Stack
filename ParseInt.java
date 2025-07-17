package example;

import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Integer: ");
			String b=sc.nextLine();
			int a=Integer.parseInt(b);
			System.out.println("The square value is "+a*a);
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an Integer");
		}
	}

}
