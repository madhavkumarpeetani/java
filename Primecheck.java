import java.io.*;
import java.util.Scanner;

class Primecheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check it is prime (or) not : ");
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
			
		if(isPrime)
			System.out.print(n+" is a prime number");
		else
			System.out.print(n+" is not a prime number");
		
	}
}
