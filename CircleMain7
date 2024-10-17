import java.io.*;
import java.util.*;
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
    Circlearea(Circlearea c)
    {
        this.r=c.r;
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

class CircleMain7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Circlearea c1 = new Circlearea();
		System.out.println("Initially,area of first circle : "+c1.area());
		Circlearea c2 = new Circlearea(7.0);
		System.out.println("Area of circle with radius 7.0 : "+c2.area());
		System.out.println("Area of circle with radius 5.5 :  "+c2.area(5.5));
		Circlearea c3 = new Circlearea(c2);
		System.out.println("After copy constructor Area of third circle : "+c3.area());
		c1.SetCircle(8.8);
		System.out.println("After setCircle area of first circle : "+c1.area());
		
	}
}
