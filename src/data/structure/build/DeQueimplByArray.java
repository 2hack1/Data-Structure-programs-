package data.structure.build;

public class DeQueimplByArray {

	 public static class Deque{
		int f=-1;
		int r=-1;
		int size=0;
		int[] arr=new int[20];
		 
		public void add(int val) {
			
			if(size==arr.length-1) {
				return;
			}
			else if(r==arr.length-1) {
			    arr[0]=val;
			    r=0;
			    return;
			}
			else if(r==-1) {
				arr[++r]=val;
				f++;
				return;
			}else {
				arr[++r]=val;
			}
			
		}
		public int delete() {
			if(f==-1) {
				return -1;				
			}
			if(f==arr.length-1) {
			f=0;
			return 0;
		}  else {
			f++;
			
			return arr[f-1];
		}
			
	 }
		public void Display() {
			for(int i=f; f<=r;i++) {
				System.out.println(arr[f]+",");
			}
			System.out.println();
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
		}
	 
}
