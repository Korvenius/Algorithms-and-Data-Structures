public class FactorialRecursive{
	
	public static void main(String[] args){
	
		System.out.println("5! = "+factorial(5));
	
	}
	
	public static long factorial(int num){
	
		if(num==1){
			
			return 1;
		}
		else{
			return  num*factorial(fact-1);
		}
	
	}

}