package data.structure.build;

import java.net.SocketTimeoutException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import javax.xml.transform.Source;

public class TwoLLcheckOne {
	static Node head1;
	static Node head2;
   
 	  class Node{
	
		String data;
		Node next;
		
		
		Node(String data){
		   this.data=data;
		   this.next=null;
		}
	}
	   public void addFirst(String val) {
		  Node n=new Node(val);
		   if(head1==null) {
			   head1=n;
			   return;
		   }
		   n.next=head1;
		   head1=n;
		   
	   }
	   public void addFirstH2(String val) {
			  Node n=new Node(val);
			   if(head2==null) {
				   head2=n;
				   return;
			   }
			   n.next=head2;
			   head2=n;
			   
		   }
	   public void printHead1() {
		   if (head1 == null) {
				System.out.println("Link list is blank");
				return;
			}
		   Node temp=head1;
		   while(temp !=null) {
			  System.out.print(temp.data+"->");
			  temp=temp.next;
		   }
		   System.out.print("NULL");
		System.out.println();
	}
	   public void printHead2() {
		   if (head2 == null) {
				System.out.println("Link list is blank");
				return;
			}
		   Node temp=head2;
		   while(temp !=null) {
			  System.out.print(temp.data+"->");
			  temp=temp.next;
		   }
		   System.out.print("NULL");
		System.out.println();
	}

		public void marge(int index) {
			Node temp1=head1;
			Node temp2=head2;
			if(temp1==null) {
				return;
			}
			for(int i=1;i<index;i++) {
				temp1=temp1.next;
			}
			
			temp2.next.next=temp1;
			
		}
		
		public Node CheckLLConnect() {
			Node temp1=head1;
			Node temp2=head2;
			Node fastPointer=head1;
			Node ShowPointer=head2;
			
			int j1=0;
			int j2=0;
			while(fastPointer.next !=null ) {
				j1++;			
				fastPointer=fastPointer.next;
									
			}	
			while(ShowPointer.next !=null ) {
				j2++	;			
				ShowPointer=ShowPointer.next;
									
			}
			
			int i=j1-j2;
			
			for(int j=1;j<=i;j++) {
				temp1=temp1.next;
				
			}
			
			System.out.println(temp1.data );
			System.out.println(temp2.data );
			while(temp1!=temp2) {
				
					temp1=temp1.next;
					temp2=temp2.next;
					
					}
			return temp1;
				
			}
			
			
			
		
		
			   
	   
	   
	public static void main(String... args) {
		
		TwoLLcheckOne a=new TwoLLcheckOne();
		a.addFirst("e");
		a.addFirst("d");
		a.addFirst("c");
		a.addFirst("b");
		a.addFirst("e");
		a.addFirst("s");
		a.addFirst("p");
		a.addFirst("pp");
				
		a.printHead1();
		a.addFirstH2("h");
		a.addFirstH2("i");	
		System.out.println();
		a.printHead2();
      a.marge(5);
      a.printHead1();
      a.printHead2();
	System.out.println(	(a.CheckLLConnect()).data);
	
		
	
	
	  LocalDate currentDate = LocalDate.now();
     
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String formattedDate = currentDate.format(formatter);
      System.out.println("Current Date: " + formattedDate);

	
	
	}
}

