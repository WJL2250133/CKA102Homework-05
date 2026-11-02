package hw1;

public class question3 {
	public static void main(String[] args) {
		int day , hours , min ,sec;
		sec = 256559 % 60;
		min = 256559 / 60 % 60;
		hours = 256559 / ( 60 * 60 ) % 24;
		day = 256559 / ( 60 * 60 * 24);
		System.out.println("256559秒有 "+ sec + " 秒 " + min +" 分 " + hours + " 小時 " + day + " 天");
		
	}

}
