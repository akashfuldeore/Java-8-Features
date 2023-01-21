package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class realTimeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> str = Arrays.asList("abc", "", "akaa", "akash", "", "aka", "akii", "ash");
		
		/*counting how many elements are in the stream at any stage of pipeline processing 
		using the count() method of Stream class.*/
		
		long count = str.stream().filter( x -> x.isEmpty()).count();
        System.out.println(count);
        
        //Count String whose length is more than three
         
        long ln = str. stream().filter(x -> x.length() > 3).count();
        System.out.println(ln);
        
        //Count number of String which starts with "a"
       
        long num = str.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(num);
        
        //Remove all empty Strings from List
        
       List <String> filtered = str.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
       System.out.println(filtered);
        
		
	}

}
