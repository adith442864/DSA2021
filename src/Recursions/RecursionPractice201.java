package Recursions;

public class RecursionPractice201 {
	
	static void fun1(int n) {

	if(n==0)
		return;
	
//	if(n==1)
	fun1(n-1);
	System.out.println(n);
	fun1(n-1);
	
		
}

public static void main(String[] args) {

	fun1(3);
}
	
	

}
