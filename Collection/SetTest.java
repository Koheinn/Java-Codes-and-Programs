package Collection;
import java.util.*;
public class SetTest {
	private String colors[] = { "red", "white", "blue",
			"green", "gray", "orange", "tan", "white", "cyan",
			"peach", "gray", "orange" };
			
			// create and output ArrayList
			public SetTest()
			{
			ArrayList list;
			
			list = new ArrayList( Arrays.asList( colors ) );
			System.out.println( "ArrayList: " + list );
			printNonDuplicates( list );
			}
			
			// create set from array to eliminate duplicates
			public void printNonDuplicates( Collection collection )
			{
			// create a HashSet and obtain its iterator
			HashSet set = new HashSet( collection );
			Iterator iterator = set.iterator();
			
			System.out.println( "\nNonduplicates are: " );
			
			while ( iterator.hasNext() )
			System.out.print( iterator.next() + " " );
			
			System.out.println();
			}

	public static void main(String[] args) {
		new SetTest();

	}

}
