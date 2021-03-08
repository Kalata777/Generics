package paket;

import java.util.Scanner;

public class NewStackTest {
	Scanner input = new Scanner(System.in);
	NewStack<String> stack1 = new NewStack<>();
	//System.out.println(stack1.getSize());
	//System.out.println(stack1.isEmpty());
	for (int i = 0; i < 5; i++) {
		stack1.push(input.nextLine());

	}
	
	System.out.println(stack1.pop());
	System.out.println(stack1.pop());
	System.out.println(stack1.pop());
	System.out.println(stack1.pop());
	System.out.println(stack1.peek());
}
