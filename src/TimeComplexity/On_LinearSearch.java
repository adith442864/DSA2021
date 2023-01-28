package TimeComplexity;

public class On_LinearSearch {
	
	/*
	 * Algorithm:
	 * step1: Traverse the array
	 * step2: Match the key element with array element
	 * step3: if the key element is found, return the index position of the array element
	 * step4: if the key element is not found, return -1
	 */
	
	public static int linearSearch(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	} //0(n) 
	

	public static void main(String[] args) {
		
//		int n =10;
//		for(int i=1; i<=n; i++) {
//			System.out.println("I am a batman " +i);
//		}
//		
//		//i=1 ==>executed 1time
//		// 1+n+n+n ==> 3n+1 ==> linear equation
//		//3n ==> n --> O(n)

		int arr[] = {1,3,44,22,56,77,11};
		int key=56;
		System.out.println(linearSearch(arr, key));
		
		//O(1) -- best case
		//O(n) -- worst case
	}

}
