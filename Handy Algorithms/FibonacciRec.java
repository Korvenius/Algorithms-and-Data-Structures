import java.util.Scanner;


public class FibonacciRec{

	public static void main(String[] args){
		
		NumTools nt=new NumTools();
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		n=sc.nextInt();
		System.out.println("The "+nt.numSuffix(n)+" number in the fibonacci sequence is: "+fibonacci(n));
	}
	
	public static int fibonacci(int n){
	
		if(n==0){
			return 0;
		}
		else if (n==1){
			return 1;
		}
		else{
			
			return fibonacci(n-1)+fibonacci(n-2);
			
		}
			
	}
	
}