package linkedlist;

public class CreateLinkedList {
	
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	public  void printList(Node node)
	{
		if(node==null)
		{
			System.out.println("Empty");
		}
		else
		{
			while(node!=null)
			{
				System.out.print(node.data+" ");
				node=node.next;
			}
		}
		System.out.println();
		
	}
	public void append(int i) {
		Node new_node= new Node(i);
		/*new_node.next=head;
		head=new_node;*/
		/*new_node.next=null;
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node node=head;
			while(node.next!=null)
			{
				node=node.next;
			}
			node.next=new_node;
			
		}*/		
	}
	
	public void appendAfter(Node second, int i) {
		Node new_node= new Node(i);
		if(second==null)
		{
			System.out.println("wrong input");
		}
		else
		{
			new_node.next=second.next;
			second.next=new_node;
		}
	}
	public void remove(int d)
	{
		Node temp=head;
		Node prv=null;
		if(temp!=null && temp.data==d)
		{
			head=temp.next;
		}
		else
		{
			while(temp!=null && temp.data!=d)
			{
				prv=temp;
				temp=temp.next;
			}
			prv.next=temp.next;
		}
	}
	
	public static void main(String[] args) {
		CreateLinkedList list=new CreateLinkedList();
		list.head= list.new Node(1);
		Node second= list.new Node(3);
		list.head.next= second;
		list.printList(list.head);
		
		//list.append(2);
		list.appendAfter(list.head,2);
		list.printList(list.head);
		list.remove(3);
		list.printList(list.head);
		list.remove(1);
		list.printList(list.head);
	}
	

}
