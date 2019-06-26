package stringConcept;

import java.util.Scanner;

public class StringLiteralAndStringClass {

	public static void main(String[] args) {

		
		//String Literal and String Object
		String str = "Padmapriya";
		String str1 = "Padmapriya";
		String s = new String("New Padmapriya");
		
		if(str==str1){
			System.out.println("Yes, It is equal");
		}else
			System.out.println("No, It is not equal");	
		
		
		
		//Program to find whether the character is Uppercase or lower case in a String
		String val;
		char a, b;
		boolean flag;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the String contains Lower and Upper");
		val = inp.nextLine();
		int num;
		for(int i = 0; i < val.length(); i++){
			b = val.charAt(i);
			a = b;
			if((Character.isLowerCase(b))){
				flag = true;
			}else
				flag = false;
			if(flag){
				System.out.println(a + " is a Lowercase");
			}else
				System.out.println(a + " is a upper case");
		}
	}

}
