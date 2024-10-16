import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Rectanglearea
{
	double l,b;
	double area()
	{
		return (l*b);
	}
}
class RectangleMain1
{
	public static void main(String args[])
	{
		Rectanglearea ra = new Rectanglearea();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter l,b of rectangle : ");
		ra.l=sc.nextDouble();
		ra.b=sc.nextDouble();
		System.out.println("Area of Rectangle is : "+ra.area());	
	}
}
