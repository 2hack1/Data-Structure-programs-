package data.structure.build;

public class QueImplByLL {
                       static Node head;
                      static Node tail;
	public static class Node{
		 
		int val;
		Node next;
		public Node(int val) {
			this.val=val;
			this .next=null;
		}
	}
	int size=0;
		public void addFirst(int value) {
			Node newnode=new Node(value);
			if(tail==null) {
				head=newnode;
				tail=newnode;
				size++;
				return;
			}
			tail.next=newnode;
			tail=newnode;
			size++;
		}
		public int delete() {
			if(head==null) {
				return -1 ;
			}
			int aa=head.val;
			head=head.next;
			size--;
			return aa;
		}
		public int peek() {
			if(head==null) {
				return -1;
			}
			return head.val;
		}
		public void sizee() {
			System.out.println("size of Queue "+size);
		}
	
		public void Display() {
			Node tempNode=head;
			while(tempNode!=tail.next) {
				System.out.print(tempNode.val+", ");
			tempNode=tempNode.next;
			}
			System.out.println();
			
		}
		public static void main(String[] args) {
			QueImplByLL a = new QueImplByLL();
			a.addFirst(1);
			a.addFirst(2);
			a.addFirst(3);
			a.addFirst(4);
			a.addFirst(5);
			
			System.out.println(a.delete());
			
			a.Display();
		System.out.println(a.peek());
		a.sizee();
	}
}
