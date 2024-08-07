package data.structure.build;

public class LL {
	static Node head;
	
	
	int count = 0;

	class Node {
		String data;
		Node next;
		// Node prew;

		Node(String data) {
			this.data = data;
			this.next = null;

		}
	}
  //**ADD THE NODE AT FIRST INDEX OR IN THE HEAD
	public void addFirst(String data) {
		Node newnode = new Node(data);
		count++;
		if (head == null) {
			head = newnode;
			return;
		}

		newnode.next = head;
		head = newnode;
	}
	
//*** ADD THE NODE AT LAST INDEX OR IN THE TAIL
	public void addLast(String data) {

		Node newnode = new Node(data);
		count++;
		if (head == null) {
			head = newnode;
			return;
		}
		Node tempPoin = head;
		while (tempPoin.next != null) {
			tempPoin = tempPoin.next;
		}
		tempPoin.next = newnode;

	}

	// ***add node in the any index in the size of LinkList
	public void addMid(int index, String value) {

		Node newNode = new Node(value);
		if (head == null) {

			head.next = newNode;
			count++;
		}

		else if (index == count) {

			LL ll = new LL();
			ll.addLast(value);
			count++;
		} else if (index == 0 || index == 1) {
			LL ll = new LL();
			ll.addFirst(value);
			count++;
		} else {

			Node temp = head;
			for (int i = 1; i < index; i++) {
				temp = temp.next;
			}
			System.out.println(newNode.data);
			newNode.next = temp.next;
			temp.next = newNode;
			count++;
		}
	}

	public void deleteFirst() {
		count--;
		if (head == null) {
			System.out.println("empty link list");
			return;
		}
		head = head.next;
	}

	public void deleteLast() {
		count--;
		if (head == null) {

			System.out.println("empty link list");
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	// delete of link list at any index to start
	public void deletAtIndex(int index) {
		
		 if (head == null) {

			System.out.println("empty link list");
			return;
		} else if (index == 1 || index == 0) {

			LL ll = new LL();
			ll.deleteFirst();
		} else {
			Node temp = head;
			for (int i = 1; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	// print LinkList by a simple
	public void print() {
		if (head == null) {
			System.out.println("Link list is blank");
			return;
		}
		Node tempPoin = head;
		while (tempPoin != null) {
			System.out.print(tempPoin.data + "->");
			tempPoin = tempPoin.next;
		}
		System.out.println("NuLL");
	}

	// print LinkList by a recursion
	public void printRecur(Node head) {
		if (head == null)
			return;
		System.out.print(head.data + "->");
		printRecur(head.next);
	}

	// REVERSE THE LINKLIST WITH THE HEPL OF RECURSION
	public void printRevers(Node head) {
		if (head == null)
			return;
		printRevers(head.next);
		System.out.print(head.data + "->");
	}

	// SIZE OF lINK LIST START WITH 1 NOT 0;
	public int getcount() {
		return count;
	}

	// CHECK THE VALUE PRESENT GIVEN INDEX OR NOT GIVEN 0
	public int indexbasevalue(String value) {
		Node newNode = new Node(value);
		Node temp = head;
		int i = 1;
		while (temp != null) {

			if ((temp.data).equals(newNode.data)) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return 0;
	}

	public Node findInLast(Node head,int index) {
		
		Node fastPointer=head;
		Node slowPointer=head;
		for(int i=1;i<=index;i++) {
		fastPointer=fastPointer.next;
		}
		while(fastPointer!=null) {
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
		}
		return slowPointer;
	}
	// DELETE AT THE LAST INDEX TO FIRST
//	public Node deleteInLast(Node head,int index) {
	public void deleteInLast(Node head,int index) {
		Node FastPointer =head;
		Node ShowPointer=head;
		for(int i=1;i<=index;i++) {
			FastPointer=FastPointer.next;			
		}
		if(FastPointer==null) {	
			LL ll =new LL();
			ll.deleteFirst();
			//head=head.next;			
	//		return head;
			return;
		}
		while(FastPointer.next !=null) {
			
			FastPointer=FastPointer.next;
			ShowPointer=ShowPointer.next;
		}
		ShowPointer.next=ShowPointer.next.next;
		//return head;
	}
	public Node searchMidOfLLForodd(Node head) {
		if(head==null) {
			return head;		
		}
		Node fPointer=head;
		Node sPointer=head;
		while(fPointer !=null && fPointer.next!=null) {
			sPointer=sPointer.next;
			fPointer=fPointer.next.next;
		}
		
		return sPointer;
	}
	//left middle
	public Node searchMidOfLLForEven(Node head) {
		if(head==null) {
			return head;		
		}
		Node fPointer=head;
		Node sPointer=head;
		while( fPointer.next.next !=null && fPointer !=null  ) {
			sPointer=sPointer.next;
			fPointer=fPointer.next.next;
		}
		
		return sPointer;
	}
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		list.addFirst("(e)");
		list.addLast("(kapil)");		
		list.print();
		list.deleteFirst();
		System.out.println("deleteFirst");
		list.print();
		list.deleteLast();
		System.out.println("deleteLast");
		list.print();
		System.out.println(list.getcount());
		list.printRecur(head);
		System.out.println("NULL");
		list.printRevers(head);
		System.out.println("NULL");
		list.addLast("e");
		list.addLast("f");
		list.addLast("g");
		list.print();
		list.addMid(2,"kk");
		list.print();
		System.out.println(list.getcount());
		list.addMid(1, "last");
		list.print();
		list.deletAtIndex(3);
		list.print();
		int a = list.indexbasevalue("kk");
		System.out.println(a);
     System.out.println((list.findInLast(head, 3)).data);
    // head= list.deleteInLast(head, 8);
  //System.out.println(head.data);
     list.deleteInLast(head, 8);
  list.print();
  list.addFirst("ak");
  list.print();
       System.out.println("search mid ="+( list.searchMidOfLLForodd(head).data));
       
    System.out.println( "left first mid ="+(list.searchMidOfLLForEven(head).data));
	}
}
