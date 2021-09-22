package Recursions;

public class RecursionBasic {
	
	static void fun1() {
		System.out.println("fun1");
	}
	
	static void fun2() {
		System.out.println("Before fun1");
		fun1();
		System.out.println("After fun1");
		
	}

	public static void main(String[] args) {
		System.out.println("Before fun2");
		fun2();
		System.out.println("After fun2");

	}

}


/*
 * Many algorithm techniques are based on recursion
 * 	dynamic programming
 * 	backtracking
 *  Divide and conquer (Binary, Quick sort, Merge Sort)
 *  
 *  Many Problems inherently recursive
 *  	Tower of Hanoi
 *  	DFS based Tree/Graph..(Inorder/Preorder/Postorder traversal of tree)...
 */
