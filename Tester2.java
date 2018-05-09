//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class is for Testing Stack 
//-----------------------------------------------------


package HW;


import java.util.Scanner;

public class Tester2 {
	
	public static void main(String[] args) {
		
		//I create an array to put the input.
		String[] anArray;
		anArray = new String[50];
		//I create a stack.
		Stack s=new Stack();
		Scanner kbd = new Scanner(System.in);
		System.out.println("Give me a sentence");
		String sentence = kbd.nextLine();
		//I split the input and put them into my array.
		anArray=sentence.split(" ");
		//I put the words into my stack 1 by 1 
		for(int i=0; i<anArray.length; i++)
		{
			s.push(anArray[i]);
		}

		System.out.println(s.toString());

	}
}

