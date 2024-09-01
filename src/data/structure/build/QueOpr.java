package data.structure.build;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class QueOpr {
   //***** IMPLEMENTAION BY A ARRAY *******
	public static class queue {

		int f = -1;
		int r = -1;
		int size = 0;
		int[] arr = new int[100];

		public void addfirst(int val) {
			if (r == arr.length - 1) {
				System.out.println("QUEUE IS FULL");
				return;
			}
			if (r == -1) {
				arr[++r] = val;
				f++;
				size++;
				return;

			}
			arr[++r] = val;
			size++;
		}

		public int remove() {
			if (size == 0) {
				System.out.println("QUEUE IS BLACK");
				return -1;
			}
			f++;
			size--;
			return arr[f - 1];
		}

		public int peek() {
			if (size == 0) {
				System.out.println("QUEUE IS BLACK");
				return -1;
			}
			return arr[f];
		}

		public void Display() {
			if (size == 0) {
				System.out.println("QUEUE IS BLACK");
			} else {
				for (int i = f; i <= r; i++) {
					System.out.print(arr[i] + ", ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		queue a = new queue();
		a.addfirst(0);
		a.addfirst(1);
		a.addfirst(2);
		a.addfirst(3);
		a.addfirst(4);
		a.Display();
		System.out.println(a.remove());
		System.out.println(a.remove());
		
        System.out.println(a.peek());
		a.Display();

		/*
		 * Queue<Integer> a=new ArrayDeque<>(); a.add(1); a.add(2); a.add(3); a.add(4);
		 * a.add(5); //print queue without using extra space int count=0;
		 * while(a.size()!=count) { System.out.print(a.peek()+", "); int abb=a.poll();
		 * a.add(abb); count++; } System.out.print(a);
		 */

	}

}
