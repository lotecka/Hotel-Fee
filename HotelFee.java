package Zadania;

import java.util.Scanner;

public class HotelFee {
	private static int priceOfNight(int age, int night) {
		int price;
		
		if(age < 18) {
			price = 100;
		} else {
			if(night == 1) {
				price = 200;
			} else if(night < 5) {
				price = 180;
			} else {
				price = 150;
			} if(age >= 65) {
				price = price * 9 / 10;
			}
		}
		return price;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Your age: ");
		int age = sc.nextInt();
		System.out.println("How many night: ");
		int night = sc.nextInt();
		
		int price = priceOfNight(age, night);
		
		System.out.println("The total cost: " + price * night + " z³");
		

	}

}
