package example;

import java.util.*;

public class Exceptionhandlingex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a:");
		try {
		int a=sc.nextInt();
		System.out.println(a);
	}
		catch(InputMismatchException e) {
			System.out.println("Pass Integer");
		}

}
}
