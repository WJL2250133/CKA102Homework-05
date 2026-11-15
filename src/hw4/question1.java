package hw4;

public class question1 {
	public static void main(String[] args) {
		int[] m1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < m1.length; i++) {
			sum += m1[i];
		}
		for (int i = 0 ; i < m1.length; i++) {
			if (m1[i] > sum / m1.length) {
				System.out.print(m1[i] + " ");
			}
		}
		System.out.println();
		System.out.println("average = " + sum / m1.length);
	}
}
