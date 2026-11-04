package hw2;

public class question7 {
	public static void main(String[] args) {
		char s = 'A';
		for (int i = 0 ; i < 6 ; i++) {
			for (int j = 0 ; j <= i; j++) {
				 s = 65;
				 i = (char)i;
				 s += i;
				 System.out.print(s);
				 i = (int)i;
			}
			System.out.println();
		}
	}

}
