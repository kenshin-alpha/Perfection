import java.util.Scanner;

class Arrays
{
	
	public static int[] createArr(int arrayLength)
	{
		int[] arr = new int[arrayLength];
		return arr;
	}
	public static int insertEle()
	{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		return a;
	}
	public static int[] insertEleAtIndex(int[] arr,int Index,int Ele)
	{
		if(arr[Index] == 0)
		{
			arr[Index] = Ele;
			return arr;	
		}
		else if(arr[arr.length - 1] == 0)
		{
			for( int i = arr.length - 2; i >= Index; i--)
			{
				arr[i+1] = arr[i];
			}
			arr[Index] = Ele;
		}
		else
		{
			arr[Index] = Ele;
			return arr;	
		}
		return arr;
	}
	public static int[] deleteELeAtIndex(int[] arr,int Index)
	{
		
		for(int i = Index; i < arr.length - 1; i++)
		{
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;

		return arr;

	}
	public static void main(String[] args) {
		int[] arr = createArr(5);
		
		arr = insertEleAtIndex(arr,1,2);
		arr = insertEleAtIndex(arr,0,5);
		arr = insertEleAtIndex(arr,4,7);
		arr = insertEleAtIndex(arr,2,3);
		arr = insertEleAtIndex(arr,4,0);
		arr = insertEleAtIndex(arr,3,3);
		arr = insertEleAtIndex(arr,3,7);
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.print(arr[i]);
		}	
		System.out.println();
		arr = deleteELeAtIndex(arr, 3);
		arr = deleteELeAtIndex(arr, 1);
		
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();

	}
}
