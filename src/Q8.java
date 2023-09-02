/**
 * @(#)Q8.java
 * Problem 8: Anagram Checker
 *
 * @author 
 * @version 1.00 2023/8/31
 */


public class Q8 {

	public static void main(String[]args){

		//test 1: same letters with same number of letters-true
		System.out.println(checkString("listen","silent"));
		//test 2: same letters with same number of letters-true
		System.out.println(checkString("debit card","Bad credit"));
		//test 3: different letters-false
		System.out.println(checkString("hello","bye"));
		//test 4: same letters with same number of letters-true
		System.out.println(checkString("restful","fluster"));
		//test 5: same letters but different number of letters-false
		System.out.println(checkString("listen","silentt"));
		//test 6: same letters with same number of letters-true
		System.out.println(checkString("Conversation","Voices, rant on"));
		
	}
	
	public static boolean checkString(String str1,String str2){
		int[] char1=new int[26];
		int[] char2=new int[26];
		//convert the two strinngs to upper case
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		
		
		for(int i=0;i<str1.length();i++){
			//check whether the characters in str1 is letetr
			if(Character.isLetter(str1.charAt(i))){
				//increase the number of letter by 1
				char1[(str1.charAt(i))-'A']++;
			}
		}
		

		for(int i=0;i<str2.length();i++){
			//check whether the characters in str2 is letetr
			if(Character.isLetter(str2.charAt(i))){
				//increase the number of letter by 1
				char2[(str2.charAt(i)-'A')]++;
			}
		}
		
		for(int i=0;i<char1.length;i++){
			//when the number of letters for the char1 array and char2 array is not same, return false
			if(char1[i]!=char2[i]){
				return false;
			}
		}
		
		//return true if the number of letters for both char1 and char2 array are same
		return true;
		
		
	}
    
    
}