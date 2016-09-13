package javaStack;
import java.util.Stack;

public class javaStacks {
	private String text;
	public javaStacks(String text) {
		this.text = text;
	}
	//For a given piece of code, 
	//write a program to detect if the code has balanced brackets.
	public boolean isBalancedBrackets(){
		Stack<Character> stack = new Stack<>();
		Character c;
		for(int i = 0; i < text.length(); i++)
		{
			c = text.charAt(i);
			if(c == '{')
			{
				stack.push(c);
			} 
			else if(c=='}')
			{
				if(stack.empty()) 
					return false;
				else 
					stack.pop();
			}
		}
		return stack.empty();	
	}
	
}
