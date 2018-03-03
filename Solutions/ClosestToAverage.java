import java.util.*;

 

public class ClosestToAverage {

   

    public static void main(String args[] ){

       

        Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Input array size");

        int number = myScanner.nextInt();

        int[] arr =  new int[number];

        double sum=0;
		
		System.out.println("Input array values.");

       

        for(int x = 0; x < arr.length; x++){

   

            arr[x] = myScanner.nextInt();

            sum = arr[x] + sum;

             

        }
		
		System.out.println("Sum is: "+sum);

        double average = (sum/arr.length);
		
		System.out.println("Average is: "+average);


        double closest= Math.abs(arr[0]-average);

        int index = 0;

            

        for (int j=0; j<arr.length; j++){

            if (Math.abs(arr[j]-average)< closest){

              closest = Math.abs(arr[j]-average);

              index = j;

            }

        }

        System.out.println(arr[index]);

    }       

}