/**
 * @(#)Q2.java
 * Problem 2: FizzBuzz
 *
 * @author 
 * @version 1.00 2023/8/30
 */


public class Q2 {

	public static void main(String[]args){
		
		for(int i=1;i<=100;i++){
			//when the number is divisible by both 3 and 5
			if(i%3==0 && i%5==0)
				System.out.print("FizzBuzz"+",");
			//when the number is divisible by 3
			else if(i%3==0)
				System.out.print("Fizz"+",");
			//when the number is divisible by 5
			else if(i%5==0)
				System.out.print("Buzz"+",");
			else
				System.out.print(i+",");
		}
		
		
	}
    
    
}