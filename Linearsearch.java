import java.io.*;
import java.util.*;
class Linearsearch
{
	public static void main(String args[])
	{
		int pos=-1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter "+n+" values into array : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter search element: ");
		int key = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				pos=i+1;
				break;
			}	
		}
		if(pos==-1)
			System.out.println(key+" not found in the array,search unsuccessfull");
		else
			System.out.println(key+" found at   "+pos+"  position in the array");
	}
}
