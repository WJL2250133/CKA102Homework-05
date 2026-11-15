package hw4;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter years");
		int years = scan.nextInt();
		boolean leapYear = true;
		if (years % 4 != 0) {
			leapYear = false;
		}else if (years % 4 == 0 && years % 100 != 0) {
			leapYear = true;
		}else if (years % 4 == 0 && years % 100 == 0 && years % 400 != 0) {
			leapYear = false;
		}else if (years % 4 == 0 && years % 100 == 0 && years % 400 == 0) {
			leapYear = true;
		}
//		判斷是否為閨年
		int months = 0;
		int days = 0;
		if (leapYear == true) {
			while(true) {
				System.out.println("enter months");
				months = scan.nextInt();
				if (months > 12 || months < 1) {
					System.out.println("enter wrong months");
				}else {
					break;
				}
			}
			while(true) {
				System.out.println("enter days");
				days = scan.nextInt();
				if (months == 1 || months == 3 || months == 5 || months == 7 
						|| months == 8 || months == 10 || months ==12 ) {
					if (days > 31) {
						System.out.println("enter wrong days");
					}else {
						break;
					}
				}
				if(months == 4 || months == 6 || months == 9 || months == 11) {
					if(days > 30) {
						System.out.println("enter wrong days");
					}else {
						break;
					}
				}
				if(months == 2) {
					if(days > 29) {
						System.out.println("enter wrong days");
					}else {
						break;
					}
				}
			}
		}else if (leapYear == false){
			while(true) {
				System.out.println("enter months");
				months = scan.nextInt();
				if (months > 12 || months < 1) {
					System.out.println("enter wrong months");
				}else {
					break;
				}
			}
			while(true) {
				System.out.println("enter days");
				days = scan.nextInt();
				if (months == 1 || months == 3 || months == 5 || months == 7 
						|| months == 8 || months == 10 || months ==12 ) {
					if (days > 31) {
						System.out.println("enter wrong days");
					}else {
						break;
					}
				}
				if(months == 4 || months == 6 || months == 9 || months == 11) {
					if(days > 30) {
						System.out.println("enter wrong days");
					}else {
						break;
					}
				}
				if(months == 2) {
					if(days > 28) {
						System.out.println("enter wrong days");
					}else {
						break;
					}
				}
			}
		}
//		判斷是否有輸入不正確的月份與日
		System.out.println(years + " years " + months + " months " + days + " days ");
		int MonthToDays = 0;
		switch(months) {
		case 12:
			MonthToDays += 30;
		case 11:
			MonthToDays += 31;
		case 10:
			MonthToDays += 30;
		case 9:
			MonthToDays += 31;
		case 8:
			MonthToDays += 31;
		case 7:
			MonthToDays += 30;
		case 6:
			MonthToDays += 31;
		case 5:
			MonthToDays += 30;
		case 4:
			MonthToDays += 31;
		case 3:
			MonthToDays += 28;
		case 2:
			MonthToDays += 31;
		case 1:
			break;
		}
		int RealDays = days + MonthToDays;
		if (leapYear == true && months >= 3) {
			RealDays += 1;
		}
//		計算實際天數
		System.out.println("realdays " + RealDays);
		scan.close();
	}
}
