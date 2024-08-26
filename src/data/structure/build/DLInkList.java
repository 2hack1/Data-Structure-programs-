package data.structure.build;

import java.security.Principal;

public class DLInkList {

	public static class Node{
		int val;
		Node next;
		Node prev;
		Node(int val){
			this.val=val;
		}
	}
	public static Node addFirst(Node head,int value) {
		
		Node t=new Node(value);
				t.next=head;
				head.prev=t;
				head=t;
				return head;
	}
		public static void print(Node head) {
			Node temp=head;
			while(temp!=null) {
				
				System.out.print(temp.val+"->");
				temp=temp.next;
			}
			System.out.println("NULL");
		}
		public static void print2(Node tail) {
			Node temp=tail;
			while(temp !=null) {
				System.out.print(temp.val+"<-");
				
			  temp=temp.prev;
			}
			System.out.print("NULL  \n");
		}
		public static void giveRendomPrintHeadTotail(Node Random) {
			Node b=Random;
			while(b.prev !=null) {
				b=b.prev;
			}
			//print(b); also be use this type
			while(b !=null) {
				
				System.out.print(b.val+"->");
				b=b.next;
			}
			System.out.print("NULL");
		}
	
	public static void  main(String[] strings ) {
		
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(5);
		Node f=new Node(6);
		Node g=new Node(7);
		a.prev=null;
		a.next=b;
		
		b.prev=a;
		b.next=c;
		
		c.prev=b;
		c.next=d;
		
		d.prev=c;
		d.next=e;
		
		e.prev=d;
		e.next=f;
		
		f.prev=e;
		f.next=g;
		
		g.prev=f;
		g.next=null;
		Node av=addFirst(a,12);
		System.out.println(av.val);
		print(a);
		print2(g);
		giveRendomPrintHeadTotail(e);
	  
	}
}
