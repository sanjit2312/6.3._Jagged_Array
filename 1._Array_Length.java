package jagged_Array;

public class Array_Length
{

	public static void main(String[] args) 
	{
		
		int num[][]=new int[3][];
		
		num[0]=new int[3];
		num[1]=new int[2];
		num[2]=new int[1];
		
		System.out.println("Array Row Size= "+num.length);
		System.out.println("Number of elements in 1st Row= "+num[0].length);
		System.out.println("Number of elements in 2nd Row= "+num[1].length);
		System.out.println("Number of elements in 3rd Row= "+num[2].length);

	}

}
