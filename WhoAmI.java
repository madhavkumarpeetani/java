import java.io.*;
class A
{
	void callMe()
	{
		System.out.println("Iam from A");
	}
}
class B extends A
{
	void callMe()
	{
		System.out.println("Iam from B");
	}
}
class WhoAmI
{
	public static void main(String args[])
	{
		A a1=new A();
		a1.callMe();
		A a2=new B();
		a2.callMe();
		B b=new B();
		b.callMe();
	}
}
