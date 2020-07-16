package jagged_Array;

import java.util.Scanner;

public class Taking_Input 
{

	public static void main(String[] args)
	{
		
		Scanner obj=new Scanner(System.in);
		int num[][]=new int[3][];
		
        num[0]=new int[3];
        num[1]=new int[2];
        num[2]=new int[1];
        
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
