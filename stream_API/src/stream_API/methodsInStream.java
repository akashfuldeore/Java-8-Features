package stream_API;

import java.util.ArrayList;

public class methodsInStream {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(25);
		l.add(20);
		l.add(30);

		// count() Method
		long count = l.stream().count();
		System.out.println(count);

	}

}
