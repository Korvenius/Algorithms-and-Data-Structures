//Kevin B. O'Kelly 01/08/2018


public class NumTools{
	
	//A simple bit of code to add a suffix to numbers
	public static String numSuffix(int n){
		
		int nEnd=n%10;
		String n2;
		if(n<20&&n>9){
			n2=n+"th";
		}
		else{
			if(nEnd==1){
				n2=n+"st";
			}
			
			else if(nEnd==2){
				n2=n+"nd";
			}
			
			else if(nEnd==3){
				n2=n+"rd";
			}
			
			else{
				n2=n+"th";
			}
		}
		
		return n2;
	
	}
	
}