import java.io.*;

abstract class Bas	
{
	Bas()
	{
		System.out.println("Bas class constructor is invoke");
	}
	abstract void fun();
}

class Derived extends Bas
{
	Derived()
	{
		super();
		System.out.println("Derived class constructor invoke");
	}
	void fun()
	{
		System.out.println("Derived fun is invoked");
	}
}

class Abstractdemo2
{
	public static void main(String args[])
	{
		Derived d =  new Derived();
		d.fun();
	}
}
