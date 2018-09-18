//making a Stack class from scratch
public class Stack
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int s)
	{
		maxSize=s;
		stackArray= new char [maxSize];
		top= -1;
	}
	
	public void push (char j)
	{
		top++;
		stackArray[top]=j;
	}
	
	public char pop()
	{
		return stackArray[top--];
	}
	
	public char peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top==maxSize);
	}
	
	public void makeEmpty()
	{
		top=-1;
	}
	
	
	public static void main(String[] args) {

        String input = "Ten animals I slam in a net";
		input = input.replaceAll("\\s","").toLowerCase();
		Stack stack=new Stack(input.length());


        for (int i = 0; i < input.length(); i++) 
		{
            stack.push(input.charAt(i));
        }
		
		
		String reverse="";
		
		
		while (!stack.isEmpty())
		{	
			reverse+=stack.pop();
		}
		
		
		if(input.equals(reverse))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
	}
		
		
		
		
		
}