package stream_API;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class realTimeExamples {

	public static void main(String[] args) {

		
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
       
       //Create a List with String more than 4 characters
        
       List <String> sortedbyMore = str.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
       System.out.println(sortedbyMore);
        
       List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

       //Convert String to uppercase and Join them with coma

      String country = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
      System.out.println(country);
      
      List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

      //Create a List of the square of all distinct numbers

      List<Integer> square = numbers.stream().distinct().map(x  -> x * x).collect(Collectors.toList());
      System.out.println(square);
      
      List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

      //Get count, min, max, sum, and the average for numbers

      IntSummaryStatistics num1 = primes.stream().mapToInt((x) -> x).summaryStatistics();
      System.out.println(num1.getMax());
      System.out.println(num1.getMin());
      System.out.println(num1.getSum());
      System.out.println(num1.getAverage());
	}
}
