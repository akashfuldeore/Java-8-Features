package stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class useMap {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(25);
		l.add(20);
		l.add(30);
		
	/*	List<Integer> l1 = new ArrayList<Integer>();
		
		for(Integer I1 : l)
		{
			l1.add(I1 * 2);
		}
		System.out.println(l1);
		 */
		
		//Using Map
		
		List<Integer> l1 = l.stream().map(i1 -> i1 * 2).collect(Collectors.toList());
		System.out.println(l1);
	}

}
