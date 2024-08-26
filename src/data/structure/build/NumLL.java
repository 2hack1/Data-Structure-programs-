package data.structure.build;

public class NumLL {
           Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=next;
		}
	}
    public void addFirst(int val) {

    	Node node=new Node(val);
    	if(head==null) {
    		head=node;
    		return;
    	}
        node.next=head;
    	head=node;
      }
	
      public void print() {
    	  if (head == null) {
  			System.out.println("Link list is blank");
  			return;
  		}
    	  Node temp=head;
    	  
    	  while(temp != null) {
    		  System.out.print(temp.data+"->");
    		 temp= temp.next;
    	  }
    	  System.out.println("NULL");
    	 
      }
      private void splitOddEver() {
    	  Node temp1=head;
    	  Node temp2=new Node(12);
    	  Node temp3=new Node(12);
    	  while(temp1 != null) {
    		  if((temp1.data)%2==0) {
    			
    			  temp2.next=temp1;
    			  
    			  
    			  temp1=temp1.next;
    		  }
    	  }
		
		
	}
	public static void main(String[] args) {
		
				NumLL num=new NumLL();
				
				num.addFirst(9);
				num.addFirst(8);
				num.addFirst(7);
				num.addFirst(6);
				num.addFirst(5);
				num.addFirst(4);
				num.addFirst(3);
				num.addFirst(2);
				num.addFirst(1);
			 num.print();
			// num.splitOddEver();
			
	}
}
