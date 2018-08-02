import java.util.stream.IntStream;
import java.util.stream.Stream;
public class PredicateInterface {
	/*
// Take while (predicate Interface)
	  public static void main(String[] args) {
	      Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty())
	         .forEach(System.out::print);		 
	   } // In that function that first collect all the element after take while they stop it 
	  //default Stream<T> takeWhile(Predicate<? super T> predicate)-syntax of Take while
	*/
	 

	  // drop while (predicate Interface)
	    /* public static void main(String[] args) {
	        Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty())
	           .forEach(System.out::print);
	        
	        System.out.println();
	        Stream.of("a","b","c","","e","","f").dropWhile(s-> !s.isEmpty())
	           .forEach(System.out::print);
	     }*/ 
	//default Stream<T> dropWhile(Predicate<? super T> predicate)
	/*
	public static void main(String[] args) {
	      IntStream.iterate(3, x -> x < 10, x -> x+ 3).forEach(System.out::println);
	   }*/ 
	//static <T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
	
	
	
	 public static void main(String[] args) {
	      long count = Stream.ofNullable(100).count();
	      System.out.println(count);
	  
	      count = Stream.ofNullable(null).count();
	      System.out.println(count);
	   } 
	  }
