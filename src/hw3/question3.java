package hw3;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		System.out.println();
		int[] array =new int[49];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			if (array[i] / 10 != num) {
				if(array[i] % 10 != num) {
					System.out.print(" " + array[i]);
				}
			}
		}
		System.out.println();
//		列印出可以選的號碼
		int[] outPut = new int[6];
		int count = 0;
		int indexNumber ;
		boolean[] useCheck = new boolean [49];
		while(count < 6) {
			indexNumber = (int) (Math.random() * (48 - 0 + 1) + 0);
			if (array[indexNumber] / 10 != num && array[indexNumber] % 10 != num) {
				if (useCheck[indexNumber] != true) {
					useCheck[indexNumber] = true;
					outPut[count] = array[indexNumber];
					count++;
				}
			}
		}
//		先判斷是不是不想選的號碼，再隨機取6個，用一個陣列來來儲存這個index是不是選過了。
		for (int i = 0 ; i < outPut.length; i++) {
			System.out.print(outPut[i] + " ");
		}
		scan.close();
	}
}
