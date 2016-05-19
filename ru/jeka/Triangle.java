package ru.jeka;

public class Triangle {
	Point a;
	Point b;
	Point c;
	public void print(){
		System.out.println("Triangle " + "a= " + a.getX() + " " + a.getY() + "b= " + b.getX() + " " + b.getY() +
							"c= " + c.getX() +" " + c.getY());
	}
	public void perSquare(){
		double ab = Math.sqrt(((b.getX() - a.getX()) * (b.getX() - a.getX())) + ((b.getY() - a.getY()) *
								(b.getY() - a.getY())));
		double ac = Math.sqrt(((c.getX() - a.getX()) * (c.getX() - a.getX())) + ((c.getY() - a.getY()) *
								(c.getY() - a.getY())));
		double bc = Math.sqrt(((b.getX() - c.getX()) * (b.getX() - c.getX())) + ((b.getY() - c.getY()) *
								(b.getY() - c.getY())));
		double per = ab + bc + ac;
		double p = per / 2;
		double square = Math.sqrt((p * (p - ab) * (p - ac) * (p - bc)));
		double h = (2 * square)/ac;
				System.out.println("Perimetr raven " + per);
		System.out.println("Ploshad ravna " + square);
		System.out.println(h);
		
	}

	
	Triangle(){
		try{
		System.out.println("Zadayte tocku A");
		a = new Point();
		System.out.println("Zadayte tocku B");
		b = new Point();
		System.out.println("Zadayte tocku C");
		c = new Point();
		
			if(((a.getX() == b.getX()) && a.getX()== c.getX()) || ((a.getY() == b.getY()) && a.getY() == c.getY()) || 
					((a.getX() == a.getY()) && (b.getX() == b.getY()) && (c.getX() == c.getY()))){
				System.out.println("Dont Triangle");
				throw new Error();
			}
		
		}
		finally{
			
		}
	}
}
