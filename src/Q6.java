/**
 * @(#)Q6.java
 * Problem 6: Find Character with Maximum Occurence
 *
 * @author 
 * @version 1.00 2023/8/31
 */

import java.util.*;

public class Q6 {

	public static void main(String[]args){
		
		String input="Hello, world!";
		//call the function occurence
		HashMap<Character,Integer> hashMap=occurence(input);

		
		//display the hash map contents
		for(HashMap.Entry<Character,Integer> entry:hashMap.entrySet()){
			char maxChar=entry.getKey();
			int maxOccurence=entry.getValue();
			System.out.println("Character:"+maxChar+",Number:"+maxOccurence);
		}
		
	}
	
	public static HashMap<Character,Integer> occurence(String input){
		HashMap<Character,Integer> hashMap=new HashMap<>();
		
		//create two arrays to store the numbers of characters for upper case letters and lower case letters respectively
		int upperCase[]=new int[26];
		int lowerCase[]=new int[26];
		
		for(int i=0;i<input.length();i++){
			//check if the chracters in the string is letter
			if(Character.isLetter(input.charAt(i))){
				//when the letter is uppercase
				if(Character.isUpperCase(input.charAt(i))){
					//increase the number of the particular character by 1
					upperCase[(input.charAt(i))-'A']++;
				}
				//when the letter is lowercase
				else{
					//increase the number of the particular character by 1
					lowerCase[(input.charAt(i))-'a']++;
				}
			}
		}
		
		int maxOccurence=0;
		char maxCharacter='\0';
		
		for(int i=0;i<upperCase.length;i++){
			//check the highest occurence of uppercase letter
			if(upperCase[i]>maxOccurence){
				maxCharacter=(char) ('A'+i);
				maxOccurence=upperCase[i];
			}
		}
		
		for(int i=0;i<lowerCase.length;i++){
			//check the highest occurence of lowercase letter
			if(lowerCase[i]>maxOccurence){
				maxCharacter=(char) ('a'+i);
				maxOccurence=lowerCase[i];
			}
		}
		
		//add the maximum occurence number and maximum occurence character in a hashmap
		hashMap.put(maxCharacter,maxOccurence);
		
		return hashMap;
				
	}
    
}