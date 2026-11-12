package hw3;

import java.util.Scanner;

public class qusetion2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random() * (100 - 0 + 1) + 0);
		while (true) {
			System.out.println("enter a number");
			int s = scan.nextInt();
			if (s > num ) {
				System.out.println("too large");
			}else if (s < num) {
				System.out.println("too small");
			}else {
				System.out.println("correct");
				break;
			}
			
		}
		scan.close();
	}
}
