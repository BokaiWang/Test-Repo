
public class LinkedList {
	public Node first;
	public Node last;
	
	public void addLast(int item) {
		var node = new Node();
		node.value = item;
		
		if (first == null) {
			first = last = node;
		}
		else {
			last.next = node;
			last = node;
		}
	}

}
