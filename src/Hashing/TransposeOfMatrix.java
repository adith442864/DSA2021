package Hashing;

import java.util.Arrays;

public class TransposeOfMatrix {
	//first column becomes first row
	
	static int n = 4;

	static void transpose(int mat[][])
	{
		int temp[][] = new int[n][n];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				temp[i][j] = mat[j][i];

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = temp[i][j];

	}

	public static void main(String args[]) 
    {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};

    	transpose(arr);

    		for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					System.out.print(arr[i][j]+" ");
				}

				System.out.println();
			}	
    } 


}
