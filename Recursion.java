//Sean Staz
//CSci 112
//Java II

public class Recursion 
{
	
	public static void main(String[] args)
	{
		int[] array = {2,7,3,9,10,15,4,12,20,5,17};
		int v1 = 2;
		int v2 = 12;
		int v3 = 17;
		int v4 = 25;
		int first = 0;
		int last = array.length-1;
		int sum = 0;
		
		System.out.println(Recursion(array, v1, first, last));
		System.out.println(Recursion(array, v2, first, last));
		System.out.println(Recursion(array, v3, first, last));
		System.out.println(Recursion(array, v4, first, last));
		System.out.println();
		System.out.println(SumArray(array, first, last, sum));
	}
	
	public static int Recursion(int[] array, int value, int first, int last)
	{
		int element = first;
		
		if(first > last)
		{
			element = -1;
			return element;
		}
		if(array[first] == value)
		{
			element = first;
			return element;
		}
		return Recursion(array, value, first + 1, last);
	}
	
	public static int SumArray(int[] array, int first, int last, int sum)
	{		
		if(first > last)
		{
			return sum;
		}
		sum += array[first];
		return SumArray(array, first + 1, last, sum);
	}
}

