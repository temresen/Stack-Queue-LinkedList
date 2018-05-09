//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class defines Queue
//-----------------------------------------------------



package HW;

public class Queue {

	LinkedList list=new LinkedList();

	public void enqueue(String item)   
	{ 
		// Checks if the list empty. If yes, inserts to head.
		if(list.size==0)
		{
			list.insertToHeadOrTail(item, 0);
		}
		//Inserting to tail.
		else
		{
			list.insertToHeadOrTail(item, 1);
		}
	}
	//Inserting to head or tail depends on the option.
	public Node dequeue()   
	{      
		return list.removeHeadOrTail(0);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}

}
