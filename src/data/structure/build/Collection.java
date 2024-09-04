package data.structure.build;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class Collection {

	public static void main(String[] args) {
//		//****hashSet is unorder and no duplicate variable allow indexing with 1
//		HashSet<Integer>s=new HashSet<>();
	//	//*** the tree is order in dicending in default like 123;
//		//TreeSet<Integer> s=new TreeSet<>();
//		//****** same to same order print 
//		LinkedHashSet<Integer> s=new LinkedHashSet<>();
//		s.add(2);
//		s.add(54);
//		s.add(33);
//		s.add(42);
//		s.add(22);
//		System.out.println(s);
//		System.out.println(s.size());
//		//*** unorder data show
		//Map<Integer, String> s=new HashMap<Integer, String>();
		//** orderd data show
		//Map<Integer, String> s=new LinkedHashMap<>();
		// ** data will be show with respect to key in sorted order
		Map<Integer, String> s=new TreeMap<>();
		 
		s.put(12,"kapil");
		s.put(32,"kapi");
		s.put(3,"kap");
		s.put(44,"ka");
		s.put(35,"k");
		s.put(0,"  ");
		
		
		System.out.println(s);
		//** override the values
				s.put(0," w ");
		System.out.println(s.get(0));
		System.out.println(s.containsKey(3));
		System.out.println(s.containsValue(s));
		//var automatic java 9 main data type adjustment
		for(var i :s.values()) {
			System.out.println(i);
		}
	     
		for(var i: s.entrySet()) {
			System.out.print(i.getKey());
		}
	}
	
}
