//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class defines SortedLinkedList
//-----------------------------------------------------

package HW;

public class SortedLinkedList {

	protected Node head;
	private int size;

	public SortedLinkedList()
	{
		Node n = new Node(null);
	}
	//insert the node to the beginning of the list if list is empty.
	void insert (String newStr)
	{
		Node a = new Node(newStr);
		Node n = head;
		if (head == null) {
			n.setNext(head);
			head = n;
			size++;
			return;
		}
		//insert the node to the beginning of the list as a new node in terms of
		//alphabetical order 
		while (n.getNext() != null && a.compareTo(n.getNext()) < 0) 
		{	
			n=n.getNext();
		}

		n.setNext(a.getNext());
		a.setNext(n);
		size++;
	}

	public boolean remove (String remStr) {
		//checks if the list is empty or not
		Node b = new Node(remStr);
		Node n = head;
		if (n == null) {
			return false;
		}
		while (n.getNext() != null) 
		{
			n = n.getNext();
			//checks if there is any duplicate node with the same data
			if (b.getData().equals(n.getData())) 
			{
				n.setNext(n.getNext().getNext());
				size--;
				return true;
			}
		}
		return false;
	}
}


