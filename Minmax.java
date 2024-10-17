import java.io.*;
import java.util.Scanner;

class Minmax
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter "+n+" elements of the array : " );
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	int min=arr[0],max=arr[0];
	for(int i=0;i<n;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
		if(max<arr[i])
		{
			max=arr[i];
		}
	}
	System.out.println("Min element of the array is "+min);
	System.out.println("Max element of the array is "+max);
	}
}
