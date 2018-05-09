//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class is for Testing
//-----------------------------------------------------

package HW;

public class Tester {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		
		//Inserting to head or tail depends on the option. Also, in a alphabetical order.
		
		ll.insertToHeadOrTail("Emre", 0);
		ll.insertToHeadOrTail("Alperen", 0);
		ll.insertToHeadOrTail("ASD", 1);
		
		
		/*ll.insertToHeadOrTail("Hello", 0);
		ll.insertToHeadOrTail("Java", 1);
		ll.insertToHeadOrTail("Michiru", 0);
		ll.insertToHeadOrTail("Tahsin", 1);
		ll.insertToHeadOrTail("<3", 0);
		ll.insertToHeadOrTail("Onur", 0);*/

		for(int i = 1; i <= ll.getSize(); i++){
			System.out.print(ll.get(i).getData() + " ");
		}
		
		//Removing from head or tail depends on the option.
		//ll.removeHeadOrTail(1);
		System.out.println();
		
		/*for(int i = 1; i < ll.getSize(); i++){
			System.out.print(ll.get(i).getData() + " ");
		}*/
	}
}


