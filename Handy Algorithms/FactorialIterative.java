public class FactorialIterative{
	
	public static void main(String[] args){
	
		System.out.println("5! = "+factorial(5));
	
	}
	
	public static long factorial(int num){
	
		long fact=1;
		while(num>0){
			
			fact *= num--;
		
		}
		
		return fact;
	
	}

}