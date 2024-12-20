import java.io.*;
import java.util.*;

class MatrixAddition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter order of 1st matrix: ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.print("Enter order of 2nd matrix: ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int b[][]=new int[r2][c2];
		if(r1!=r2 && c1!=c2)
		{
			System.out.println("Matrix Addition is not possible!,Order of matrices does n't match each other.");
			System.exit(1);
		}
		else
		{
			System.out.println("Enter " +(r1*c1 )+ " elements into first matrix : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter " +(r2*c2)+ " elements into second matrix : ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			int c[][] = new int[r1][c1];
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("After summation,the resultant matrix is : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
