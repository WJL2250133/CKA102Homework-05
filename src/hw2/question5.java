package hw2;

public class question5 {
	public static void main(String[] args) {
		for (int i = 0 ; i <= 49 ; i++) {
			if (i / 10  != 4) {
				if ( i % 10 != 4) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
