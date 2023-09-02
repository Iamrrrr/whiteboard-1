/**
 * @(#)Q3.java
 * Problem 3: Fibonacci sequence
 * 
 * @author 
 * @version 1.00 2023/8/30
 */



import java.util.*;

public class Q3 {

	public static void main(String[]args){
		//create Scanner object
		Scanner input=new Scanner(System.in);
		
		//ask user input
		System.out.print("Enter how many number:");
		int number=input.nextInt();
		
		//create an array list to call fibonacciSequence function
		ArrayList<Integer> fibonacci=fibonacciSequence(number);
		
		for(int value: fibonacci){
			System.out.println(value);
		}
	}
	
	public static ArrayList<Integer> fibonacciSequence(int number){
		ArrayList<Integer> fibonacci=new ArrayList<>();
		
		//fibonacci is empty
		if(number<=0)
			return fibonacci;
		
		//fibonacci is filled with either 1 or 2 numbers	
		else if(number<=2){
			for(int i=0;i<number;i++){
				fibonacci.add(i);
			}
			return fibonacci;
		}
		
		
		else{
			//recrusion
			fibonacci=fibonacciSequence(number-1);
			fibonacci.add(fibonacci.get(fibonacci.size()-1)+fibonacci.get(fibonacci.size()-2));
			return fibonacci;
		}

	}
    
    
}