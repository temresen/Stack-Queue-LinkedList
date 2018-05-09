//-----------------------------------------------------
//Title: Stack
// Author: T. Emre Sen
//Description: This class defines a Node
//-----------------------------------------------------

package HW;

public class Node {

	private String data;
	Node next;
	public String item;
	public Node (String data) {
		this.data = data;
		next = null;
	}
	public String getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(String newdat)
	{
		data = newdat;
	}
	public void setNext(Node newNext) 
	{
		next = newNext;
	}
	
	public int compareTo(Node o) {
		return this.getData().compareTo(o.getData());
	}
}
