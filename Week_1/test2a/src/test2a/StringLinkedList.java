package test2a;

public class StringLinkedList 
{
	private ListNode head;
	public StringLinkedList()
	
	{
		head = null;
	}
	
	public void addANodeToStart(String addData) 
	{
		head = new ListNode(addData, head);
	}
	
	public void deleteHeadNode() 
	{
		if (head != null)
			head = head.link;
		else 
		{
			System.out.println("Deleting from an empty list.");
			System.exit(0);
		}
	}
	
	public void showList1() 
	{
		ListNode position;
		position = head;
		while (position != null) {
			System.out.println(position.data);
			position = position.link;
		}
	}
	
	public void showList2() 
	{
		printList(head);
	}
	
	private void printList(ListNode list) 
	{
		if(list != null) {
			printList(list.link); //RECURSIVE METHOD
			System.out.println(list.data);
		}
	}
	private class ListNode
	{
		private String data;
		private ListNode link;
		public ListNode() {
			link = null;
			data = null;
		}
	}
	
	public ListNode(String newData, ListNode linkValue) {
		data = newData;
		link = linkValue;
	}
	
}
