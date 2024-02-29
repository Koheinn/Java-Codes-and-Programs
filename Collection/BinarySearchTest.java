package Collection;
import java.util.*;
public class BinarySearchTest {
	private String colors[] = { "red", "white", "blue", "black","yellow","purple","tan","pink"};
	private ArrayList list;
	public BinarySearchTest() {
		list=new ArrayList(Arrays.asList(colors));
		Collections.sort(list);
		System.out.println("Sorted ArrayList: "+list);
	}
	public void printSearchResults() {
		printSearchResultsHelper( colors[ 0] ); // first item
	    printSearchResultsHelper( colors[ 3 ] ); // middle item
		printSearchResultsHelper( colors[ 7 ] ); // last item
		printSearchResultsHelper( "aardvark" ); // below lowest
		printSearchResultsHelper( "goat" ); // does not exist
		printSearchResultsHelper( "zebra" ); // does not exist
	}
	private void printSearchResultsHelper(String key) {
		int result=0;
		System.out.println("\nSearching for: "+key);
		result=Collections.binarySearch(list, key);
		System.out.println(
				 ( result >= 0 ? "Found at index " + result :
				 "Not Found (" + result + ")" ) );
				 
	}
	public static void main(String[] args) {
		new BinarySearchTest().printSearchResults();

	}

}
