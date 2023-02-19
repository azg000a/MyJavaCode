package collectionsExamples;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeSet;

public class collectionsPractrice {

	public static void main(String[] args) {

		
		
		Deque <String> dq = new LinkedList<String>();
		
		
		dq.add("1");
		dq.add("2");
		dq.addFirst("3");
		dq.addLast("4");
		
		System.out.println("poll: " +  dq.poll());
		
		System.out.println(dq);
		
		
		
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 
		 TreeSet<String> ts = new TreeSet();
		 
		ts.add("test3");
		ts.add("test2");
		ts.add("test1");
		ts.add("test3");
		
	    System.out.println(ts);
	}

}
