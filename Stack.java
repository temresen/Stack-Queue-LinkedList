//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class defines Stack
//-----------------------------------------------------

package HW;

public class Stack {
	LinkedList list=new LinkedList();
	//Inserting to head or tail depends on the option.
	public void push(String item)
	{
		list.insertToHeadOrTail(item, 0);
	}
	public Node pop() 
	{
		return list.removeHeadOrTail(0);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}


}
