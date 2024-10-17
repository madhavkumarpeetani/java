import java.io.*;
import java.util.Scanner;

class Circlearea
{
	double r;
	Circlearea()
	{
		r=0;
	}
	Circlearea(double r)
	{
		this.r=r;
	}
	Circlearea(int r)
	{
		this.r=r;
	}
	double area()
	{
		return (22/7.0)*r*r;
	}
	double area(double x)
	{
		return (22/7.0)*x*x;
	}
	void SetCircle(double r)
	{
		this.r=r;
	}	
}

class CircleMain6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Circlearea c1 = new Circlearea();
		Circlearea c2 = new Circlearea(3.6);
		Circlearea c3 = new Circlearea(5);
		System.out.println("Area of 1st circle is  "+c1.area());
		System.out.println("Area of 1st circle updated is  "+c1.area(8));
		System.out.println("Enter radius of circle to find area ");
		double radius = sc.nextDouble();
		Circlearea c4 = new Circlearea();
		c4.SetCircle(radius);
		System.out.println("Area of circle is "+c4.area());
		System.out.println("Area of 2nd circle  is  "+c2.area());
		System.out.println("Area of 3rd circle is  "+c3.area());
	}
}
