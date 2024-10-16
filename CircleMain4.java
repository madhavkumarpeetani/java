import java.io.*;
import java.util.Scanner;


class CircleArea4
{
	double r;
	double area()		
	{
		return (22/7.0)*r*r;
	}
	void setCircle(double r) 	
	{
		this.r=r;			
	}
	
}
class CircleMain4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea4 ob1 = new CircleArea4();
		CircleArea4 ob2 = new CircleArea4();
		System.out.print("Enter Radius of two circle : ");
		double radius1=sc.nextDouble();
		double radius2=sc.nextDouble();
		ob1.setCircle(radius1);
		ob2.setCircle(radius2);
		System.out.println("Area of Circle-1 is : "+ob1.area());	
		System.out.println("Area of Circle-2 is : "+ob2.area());
	}
}
