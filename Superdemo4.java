import java.io.*;
import java.util.*;
class Point2D
{
    int x,y;
	Point2D()
	{
		x=0;
		y=0;
	}
	Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Point3D extends Point2D
{
    int z;
    Point3D()
	{
		super();
	z=0;
	}
	Point3D(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
}
class Superdemo4
{
	public static void main(String args[])
	{
		Point3D ob=new Point3D();
	}
}
