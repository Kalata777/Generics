package paket;

import java.util.Scanner;

public class TestGenericStack {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		GenericStack<String> stack1 = new GenericStack<>();
	
		for (int i = 0; i < 5; i++) {
			stack1.push(input.nextLine());

		}
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.peek());
		

	}
}
