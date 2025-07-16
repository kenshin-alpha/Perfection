class ThreeArray
{
	public static void main(String[] args)
	{
		int[][][] arr = {{{2,3,4},{2,3,1}},{{1,2,3},{12,12,13}}};
		
		for (int arr2d[][]:arr)
		{
			for( int arr1d[]:arr2d)
			{
				for(int arrd: arr1d)
				{
					System.out.println(arrd);
				}
			}
		}
	}
}
