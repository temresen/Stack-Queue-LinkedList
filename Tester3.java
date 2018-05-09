//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class is for Testing Queue
//-----------------------------------------------------


package HW;

import java.util.Scanner;

public class Tester3 {
	public static void main(String[] args) {
		//I create an array to put the input.
		String[] anArray;
		anArray = new String[50];
		//I create a queue.
		Queue que = new Queue();
		Scanner kbd = new Scanner(System.in);
		System.out.println("Give me a sentence");
		String sentence = kbd.nextLine();
		//I split the input and put them into my array.
		anArray=sentence.split(" ");
		//I put the words into my queue 1 by 1 
		for(int i=0; i<anArray.length; i++)
		{
			que.enqueue(anArray[i]);
		}

		System.out.println(que.toString());

	}
}
