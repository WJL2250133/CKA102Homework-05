package hw1;

public class question5 {
	public static void main(String[] args) {
		double presentValue = 1500000;
		double futureValue ;
		double interestRate = 0.02;
		futureValue = presentValue * (Math.pow((1 + interestRate), 10));
		System.out.println("本金150萬10年後的本利和為 " + futureValue + " 元");
		
	}

}
