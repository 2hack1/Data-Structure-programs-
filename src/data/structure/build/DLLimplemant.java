package data.structure.build;

import java.awt.HeadlessException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.xml.transform.Source;

import data.structure.build.DLInkList.Node;

public class DLLimplemant {
	static Node head;

	public class Node {

		Node next;
		Node prev;
		int val;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		Node temp = head;
		while (temp.next != null) {
//	        			System.out.print(temp.val+"->");
			temp = temp.next;
		}
//	        	System.out.println("NULL");	
		temp.next = newNode;
		newNode.prev = temp;
		temp = newNode;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public void giveRandomPrintHeadToTail() {
		Node temp = head;
		while (temp.next != null) {

			temp = temp.next;
		}
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.prev;
		}
		System.out.print("NULL \n");
	}

	public void addAtIndex(int index,int value) {
		Node temp=head;
		Node newNode=new Node(value);
		if(index==0) {
			addFirst(value);
			return;
		}
		int count=0;
		while(temp.next!=null){
			temp=temp.next;
			count++;
			if(count==index) {
				System.out.println(count);
				break;
			}
		}
			if(temp.next == null) {
				addLast(value);
				return;
			}else {
				
				newNode.prev=temp;
				newNode.next=temp.next;		
				temp.next.prev=newNode;
				temp.next=newNode;
			}
			
			print();
			giveRandomPrintHeadToTail();
		}
	public void deleteFirst() {
		if(head== null) {
			return ; 
		}
		head.next.prev=null;
		head=head.next;
		print();
		giveRandomPrintHeadToTail();
		
	}
	public void deleteLast() {
		Node temp=head;
		if(temp==null) {
			return;
		}
		while(temp.next != null) {
			temp =temp.next;
		}
		temp.prev.next=null;
		temp.prev=null;
		print();
		giveRandomPrintHeadToTail();
	}
	public void deletAtIndex(int index) {
		Node temp=head;
		int count=0;
		if(count==index) {
			deleteFirst();
			return;
		}
		while(temp.next != null) {
			temp=temp.next;
			count++;			
			if(count==index) {
				break;
			}
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		print();
		giveRandomPrintHeadToTail();
	}
	
	public static void main(String[] args) {
		DLLimplemant aa = new DLLimplemant();
		aa.addFirst(1);
		aa.addFirst(2);
		aa.addFirst(3);
		aa.addFirst(4);
		aa.addLast(0);
		
	//	aa.deleteLast();
		
		aa.print();
		aa.giveRandomPrintHeadToTail();
		
	//	aa.addAtIndex(3,45);
		//aa.deleteFirst();
		//aa.deletAtIndex(2);
		
	}
}
