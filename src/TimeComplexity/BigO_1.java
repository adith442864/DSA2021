package TimeComplexity;

public class BigO_1 {
	
	
	//1+1+1+1 = 4 ===> O(4) ==> O(1) -- constant time
	public static int sum(int a, int b) {
		int total = a+b; 
		return total;
	}

	public static void main(String[] args) {
		
		int s1 = sum(10, 20);
		System.out.println(s1);
		
		int arr[] = {1,2,3,5};
		System.out.println(arr[2]); //Accessing a value from Array
		
		int a = 10; //O(1)

	}

}
