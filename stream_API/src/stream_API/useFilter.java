package stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class useFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(25);
		l.add(20);
		l.add(30);
		
	/*	List<Integer> l1 = new ArrayList<Integer>();
		
		for(Integer I1 : l) {
			if(I1 % 2 == 0) {
				l1.add(I1);
			}
		}
		System.out.println(l1); 
		*/
		
		//Using Filter
		List<Integer> a1 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(a1);
	}

}
