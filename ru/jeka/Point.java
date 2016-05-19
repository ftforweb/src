package ru.jeka;

import java.util.Scanner;

public class Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	Point(){
		boolean err;
		do{
			err = false;
			System.out.println("Vvedite koordinatu x");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextDouble()){
				x = sc.nextDouble();
			}
			else{
				err = true;
				System.out.println("Vi vveli ne chislo");
			}
		}
		while(err);
		
		do{
			err = false;
			System.out.println("Vvedite koordinatu y");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextDouble()){
				y = sc.nextDouble();
			}
			else{
				err= true;
				System.out.println("Vi vveli ne chislo");
			}
		}
		while(err);
			
		
	}
}
