import java.util.Optional;
public class ifPresentOrElse {
	public static void main(String[] args) {
	      Optional<Integer> optional = Optional.of(1);

	      optional.ifPresentOrElse( x -> System.out.println("Value: " + x),() -> 
	         System.out.println("Not Present."));

	      optional = Optional.empty();

	      optional.ifPresentOrElse( x -> System.out.println("Value: " + x),() -> 
	         System.out.println("Not Present."));
	   }  
}
//public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction) in that funcion  just like a if or else function