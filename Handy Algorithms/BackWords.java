import java.util.Scanner;

public class BackWords{
	

	public static void main(String[] args){

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word or sentence:\n");
		str=sc.nextLine();
		char[] charArr=new char[str.length()];
		int counter=0;

		for(int i=str.length()-1; i>=0; i--){
		    charArr[counter]=str.charAt(i);
		    counter++;
		}
		
        //String str2= new String(charArr);
        System.out.println(charArr);
	    
	}
}