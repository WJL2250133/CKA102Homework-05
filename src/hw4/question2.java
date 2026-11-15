package hw4;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		System.out.println("enter words");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for (int i = s.length()-1 ; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		scan.close();
	}
}
