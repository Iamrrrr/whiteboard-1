/**
 * @(#)Q5.java
 * Problem 5: Find List Symmetric Difference
 *
 * @author 
 * @version 1.00 2023/8/30
 */


public class Q5 {

    public static void main(String[]args){
    	//create the array for two list of numbers
    	int [] list1={4,5,2,3,1,6};
    	int [] list2={8,7,6,9,4,5};
    	//call function symmetricDifference by passing two arrays
    	int [] differ=symmetricDifference(list1,list2);
    	
    	int temp;
    	//bubble sort to sort the numbers in ascending order
    	for(int i=0;i<differ.length;i++){
    		for(int j=i+1;j<differ.length;j++){
    			if(differ[i]>differ[j]){
    				temp=differ[i];
    				differ[i]=differ[j];
    				differ[j]=temp;
    			}
    		}
    	}
    	
    	//display the output
    	for(int value:differ){
    		System.out.print(value+",");
    	}	

    		
    }
    
    
    public static int[] symmetricDifference(int[] list1,int[] list2){
    	//create an array differ to hold the symmetric difference number
    	int [] differ=new int[list1.length+list2.length];
    	int index=0;
    	boolean intersect;
		
		for(int value:list1){
			intersect=false;
			for(int value2:list2){
				if(value==value2){
					intersect=true;
					break; //if the value is found, stop the for loop
				}
			}
			//if the number is not intersect, add the number into differ array
			if(!intersect){
				differ[index]=value;
				index++;
			}		
		}
		
		
		for(int value:list2){
			intersect=false;
			for(int value2:list1){
				if(value==value2){
					intersect=true;
					break;	//if the value is found, stop the for loop
				}
			}
			//if the number is not intersect, add the number into differ array
			if(!intersect){
				differ[index]=value;
				index++;
			}		
		}
		
		/*the differ array may be with larger size and the remaining spaces will be
    	 *automatically intialized with 0, therefore the newDiffer array with the sufficient
    	 *size only will be created to ensure there is no unwanted number in the array
    	 */
		int [] newDiffer=new int[index];
		for(int i=0;i<newDiffer.length;i++){
			newDiffer[i]=differ[i];
		}
		
		return newDiffer;
		


    }
    
    
}