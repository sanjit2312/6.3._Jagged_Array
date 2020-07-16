package jagged_Array;

import java.util.Scanner;

public class Dynamic_Memory_Allocation 
{

	public static void main(String[] args) 
	{
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n=obj.nextInt();
		int num[][]=new int[n][];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number of elements in Row "+(i+1));
			int m=obj.nextInt();
			num[i]=new int[m];
		}
		System.out.println("Enter values: ");
	        for(int i=0;i<num.length;i++)
	        {
	        	for(int j=0;j<num[i].length;j++)
	        	{
	        		num[i][j]=obj.nextInt();
	        	}
	        }
	     System.out.println("You Enter values: ");
	        for(int i=0;i<num.length;i++)
	        {
	        	for(int j=0;j<num[i].length;j++)
	        	{
	        		System.out.print(num[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	        obj.close();

	}

}
