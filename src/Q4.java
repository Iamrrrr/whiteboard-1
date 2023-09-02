/**
 * @(#)Q4.java
 * Problem 4: Find list intersection
 *
 * @author 
 * @version 1.00 2023/8/30
 */

public class Q4 {
	
    public static void main(String[]args){
    	//create two list array
    	int [] list1={4,5,2,3,1,6};
    	int [] list2={8,7,6,9,4,5};
    	
    	//call intersectNumbers function by passing two list array
    	int [] intersect=intersectNumbers(list1,list2);
    
    	
    	for(int value:intersect){
    		System.out.println(value);
    	}
    	
    	
    		
    }
    
    public static int[] intersectNumbers(int[] list1,int[] list2){
    	
  		//create an intersect array 
    	int [] intersect=new int[Math.min(list1.length,list2.length)];
    	//initialize index to 0
    	int index=0;
    	
    	//check the intersect numbers between two array and store into intersect array
    	for(int i=0;i<list1.length;i++){
    		for(int j=0;j<list2.length;j++){
    			if(list1[i]==list2[j]){
    				intersect[index]=list1[i];
    				index++;
    			}
    		}
    	}
    	
    	/*the instersect array may be with larger size and the remaining spaces will be
    	 *automatically intialized with 0, therefore the newIntersect array with the sufficient
    	 *size only will be created to ensure there is no unwanted number in the array
    	 */
    	int [] newIntersect=new int[index];
    	for(int i=0;i<index;i++){
    		newIntersect[i]=intersect[i];
    	}
    	
    	return newIntersect;
    }
}
