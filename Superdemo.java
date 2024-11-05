class Animal
{
	String color="White";
}
class Dog extends Animal
{
	String color="Black";
	void printcolor()
	{
		System.out.println("Dog color is "+color);
		System.out.println("Animal color is "+super.color);
	}
}
class Superdemo
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.printcolor();
	}
}
