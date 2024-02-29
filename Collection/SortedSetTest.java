package Collection;
import java.util.*;

public class SortedSetTest {
	private static String names[] = { "yellow", "green", "black",
			"tan", "grey", "white", "orange", "red", "green" };
			
			// create a sorted set with TreeSet, then manipulate it
			public SortedSetTest()
			{
			TreeSet tree = new TreeSet( Arrays.asList( names ) );
			
			System.out.println( "set: " );
			printSet( tree );
			
			// get headSet based upon "orange"
			System.out.print( "\nheadSet (\"orange\"): " );
			printSet( tree.headSet( "orange" ) );
			
			// get tailSet based upon "orange"
			System.out.print( "tailSet (\"orange\"): " );
			printSet( tree.tailSet( "orange" ) );
			
		    // get first and last elements
			System.out.println( "first: " + tree.first() );
			System.out.println( "last : " + tree.last() );
			}
			
			// output set
			public void printSet( SortedSet set )
			{
			Iterator iterator = set.iterator();
			
			while ( iterator.hasNext() )
			System.out.print( iterator.next() + " " );
			
			System.out.println();
			} 
	public static void main(String[] args) {
		new SortedSetTest();

	}

}
