/**
 * @(#)Q1.java
 * Problem 1: Sorting
 *
 *
 * @author 
 * @version 1.00 2023/8/30
 */


public class Q1 {

    public static void main(String[]args){
    	//create the number array and store the elements
    	int [] numArr={21,400,8,-3,77,99,-16,55,111,-36,28};4
    	
    	//declare a temporary variable to hold an array element
    	int temp;
    	
    	//bubble sort
    	for(int i=0;i<numArr.length;i++){
    		for(int a=i+1;a<numArr.length;a++){
    			//if the previous number is greater, swap place
    			if(numArr[i]>numArr[a]){
    				temp=numArr[a];
    				numArr[a]=numArr[i];
    				numArr[i]=temp;	
    			}
    		}
    	}
    	
    	
    	//for each loop to display the value in number array
    	for(int value: numArr){
    		System.out.print(value+" ");
    	}
    	
    }
    
    
}