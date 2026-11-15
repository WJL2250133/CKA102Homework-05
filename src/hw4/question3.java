package hw4;

public class question3 {
	public static void main(String[] args) {
		String[] planet ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for (int i = 0 ; i < planet.length; i++) {
			for (int j = 0 ; j < planet[i].length(); j++) {
				if (planet[i].charAt(j) == 'a' ) {
					count++;
				}else if (planet[i].charAt(j) == 'e') {
					count++;
				}else if (planet[i].charAt(j) == 'i') {
					count++;
				}else if (planet[i].charAt(j) == 'o') {
					count++;
				}else if (planet[i].charAt(j) == 'u') {
					count++;
				}
			}
		}
		System.out.print(count);
	}
}
