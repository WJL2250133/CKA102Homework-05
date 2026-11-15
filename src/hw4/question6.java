package hw4;

public class question6 {
	public static void main(String[] args) {
		int[][] table = new int[][]{{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},
			{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},
			{90,80,100,75,50,20,99,75}};
		int[] count = new int[8];
		int max = 0;
		int record = 0;
		System.out.println("最高分的座號");
		for(int i = 0; i < table.length; i++) {
			max = table[i][0];
			for(int j = 0; j < table[i].length; j++) {
//				System.out.print(table[i][j] + " ");
				if (table[i][j] > max) {
					max = table[i][j];
					record = j;
				}
			}
			if (max == table[i][0]) {
				record = 0;
			}
			System.out.print((record + 1) + " 號 ");
			count[record] += 1;
//			System.out.print(max + " ");
		}
		System.out.println();
		System.out.println("最高分的次數");
		for(int i = 0 ;i < count.length; i++ ) {
			System.out.println((i + 1) + " 號 " + count[i] + " 次 ");
		}
	}
}
