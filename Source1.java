package p1;

import java.util.ArrayList;
import java.util.Arrays;

public class Source1{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));

		ArrayListOps obj = new ArrayListOps();

		ArrayList<Integer> l1 = obj.makeArrayListInt(4);
		ArrayList<Integer> l2 = obj.reverseList(list);
		ArrayList<Integer> l3 = obj.changeList(l2, 28, 20);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}




