/**
 * @(#)Q7.java
 * Problem 7: Square Root
 *
 * @author 
 * @version 1.00 2023/8/31
 */


public class Q7 {

	public static void main(String[]args){
		
		//assume number is a perfect square
		int number=4;
		
		//call function squareRoot
		int sqrRootNo=squareRoot(number);
		
		//display the square root number
		System.out.println("Number:"+number+" Square Root:"+sqrRootNo);
	}
	
	public static int squareRoot(int number){
		
		//display error message and exit when the number is negative
		if(number<0){
			System.out.print("There is no square root for negative number");
			System.exit(1);
		}
		
		int result=0;
		for(int i=0;i<=number;i++){
			if((i*i)==number){
				result=i;
				break;
			}
		}
		
		return result;
		
	}
    
    
}