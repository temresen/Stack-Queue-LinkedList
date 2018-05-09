//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class defines LinkedList
//-----------------------------------------------------

package HW;

public class LinkedList {

	protected Node head, tail;
	protected int size = 0;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	//insert the node to the beginning of the list as a new head node if option is 0 
	//and to the end of the list if option is 1. 
	void insertToHeadOrTail(String newString, int option) {
		Node newStr = new Node(newString);
		if (option == 0) {
			newStr.setNext(head);
			head = newStr;
			size++;
		}
		else if (option == 1) {
			get(size).setNext(newStr);
			size++;
		}
	}
	//remove the node from the beginning of the list if option is 0 
	//and from the end of the list if option is 1. 
	public Node removeHeadOrTail(int option) {
		if (size < 1) {
			System.out.println("Error");
			return null;
		}
		if (option == 0) {
			Node n = head;
			head = head.getNext();
			n.setNext(null);
			size--;
			return n;
		}
		else if (option == 1) {
			Node n = get(size);
			get(size -1).setNext(null);
			size--;
			return n;
		}
		return null;
	}
	Node getFirst() 
	{
		return head;
	}

	Node get(int i){
		if(i > size){
			System.out.println("Error.");
		}
		Node n = head;
		for(int j = 1; j < i; j++)
			n = n.getNext();

		return n;
	}
	int getSize() 
	{
		return size;
	}
	
	Node getNext(Node c)
	{
		return c.getNext();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		for(int i = 1; i <= getSize(); i++){
			s+=(get(i).getData() + " ");
		}
		return s;
	}
	
}
