import java.util.LinkedList;
import java.util.Iterator;

public class IteratorDemo{
	public static void main(String args[]) {
		// Create a linked list
		LinkedList<String> al = new LinkedList<String>();
		  
		// add elements to the array list
		al.add("dog");
		al.add("bird");
		al.add("fish");
		al.add("cat");
		al.add("monkey");
		al.add("lizard");


		Iterator<String> itr = al.iterator();
		System.out.println("Solving using iterator: ");
		boolean flag = true;
		while(itr.hasNext() && flag) {
			String element = itr.next();
			if(element.equals("cat")){
				flag = false;
			}
			else{
				System.out.print(element + " ");
			}
		}
	}
}