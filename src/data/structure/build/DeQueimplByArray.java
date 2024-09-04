package data.structure.build;

public class DeQueimplByArray {

	 public static class Deque{
		int f=-1;
		int r=-1;
		int size=0;
		int[] arr=new int[6];
		 
		public void add(int val) {
			
			if(size==0) {
				arr[++r]=val;
				f++;
				size++;
			}
			else if(r+1==f) {
			    System.out.println("que is full first delete");
			    return;
			}
			else if(r<arr.length-1) {
				arr[++r]=val;
				size++;
				
			}else if(r==arr.length-1)  {
				r=0;
				arr[0]=val;
				size++;
			}
			
		}
		public int delete() {
			if (size == 0) {
				System.out.println("QUEUE IS BLACK");
				return -1;
			}
			else if(f==r) {
				System.out.println(" f==r QUEUE IS BLACK");
				return -1;
			}
			else if(f<arr.length-1) {
				int a=arr[f];
				f++;
				size--;
				return a;
			}else if(f== arr.length-1) {
				int a=arr[f];
				f=0;
				size--;
				return a;
			}
			
			return 0;
	 }
		public void Display() {
			if (size == 0) {
				
				System.out.println("QUEUE IS BLACK");
				return;
			}
		
				else if(r<f) {
				for (int i = f; i <= arr.length-1; i++) {
					System.out.print(arr[i] + ", ");
				}
				for(int i=0;i<=r;i++) {
					System.out.print(arr[i]+", ");
				}
				
			}
			
			else if(r>f) {
				for (int i = f; i <= r; i++) {
					System.out.print(arr[i] + ", ");
				}
			}
			System.out.println();
		}
		public int peek() {
			 return arr[r];
		 }
		}
	 
	 
		public static void main(String[] args) {
			//DeQueimplByArray aa =new DeQueimplByArray();
			
			Deque a=new Deque();
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			a.add(5);
			a.Display();
			a.delete();
			a.delete();
			a.delete();
			a.delete();
			
			
			a.add(11);
			a.add(22);
			a.add(33);
			a.add(44);
			a.delete();
			
			a.delete();
			a.delete();
			a.Display();
			System.out.println(a.peek());

		}
	 
}
