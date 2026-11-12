package hw3;
import java.util.*;

public class question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] tri = new int[3];
		for (int i = 0 ; i < tri.length; i++ ) {
			System.out.println("enter length");
			tri[i] = scan.nextInt();
		}
		if(tri[0] == 0 && tri[1] == 0 && tri[2] == 0 ) {
			System.out.println("不是三角形");
		} else {
			if(Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2) || Math.pow(tri[1], 2) + Math.pow(tri[2], 2) == Math.pow(tri[0], 2) 
					|| Math.pow(tri[0], 2) + Math.pow(tri[2], 2) == Math.pow(tri[1], 2)) {
				System.out.println("直角三角形");
			}
			if (tri[0] == tri[1] && tri[1] == tri[2]) {
				System.out.println("正三角形");
			}else if (tri[0] == tri[1] || tri[0] == tri[2] || tri[1] == tri [2]) {
				System.out.println("等腰三角形");
			}else {
				System.out.println("其他三角形");
			}
			
		}
		scan.close();
	}
}
