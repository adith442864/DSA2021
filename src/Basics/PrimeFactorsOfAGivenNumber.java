package Basics;

public class PrimeFactorsOfAGivenNumber {
	
	static void printPrimeFactors(int n)
	{
		if(n <= 1)
			return;

		for(int i=2; i*i<=n; i++)
		{
			while(n % i == 0)
			{
				System.out.print(i+" ");

				n = n / i;
			}
		}

		if(n > 1)
			System.out.print(n+" ");

		System.out.println();
	}

	public static void main (String[] args) {
		int n=84;
		//int n = 12;

		printPrimeFactors(n);

	}

}

//time complexty : O(n2logn)

//Algorithm logic:
//	i=2
//	print(2)
//	84/2 = 42
//	print(2)
//	42/2 = 21
//	i=3
//	21/3 =7
//	come out of loop and print 7