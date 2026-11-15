package hw4;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		System.out.println("enter numbers of employees");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int[][] emp = new int[2][number];
		for (int i = 0; i < emp.length; i++) {
			for (int j = 0 ; j < emp[i].length; j++) {
				if (i == 0) {
					System.out.println("enter employees number");
					emp[i][j] = scan.nextInt();
				}
				if (i == 1) {
					System.out.println("enter cash");
					emp[i][j] = scan.nextInt();
				}
			}
			System.out.println();
		}
		for (int i = 0; i < emp.length; i++) {
			for (int j = 0 ;j < emp[i].length; j++) {
				System.out.print(emp[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("enter want cash");
		int cash = scan.nextInt();
		int count = 0;
		System.out.println("可以借的員工編號");
		for (int i = 0; i < emp[1].length; i++) {
			if (emp[1][i] >= cash) {
				System.out.print(" " + emp[0][i] + " ");
				count++;
			}
		}
		System.out.print("總共 " + count + " 人");
		scan.close();
	}
}
