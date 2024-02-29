package Collection;

import java.util.*;

public class MapTest {
private static String names[]= {"one","two","three","four","five","six","seven","two","ten","four"};
public MapTest() {
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	Integer i;
	for(int count=0;count<names.length;count++) {
		i=(Integer)map.get(new Character(names[count].charAt(0)));
		if(i==null) {
			map.put(new Character(names[count].charAt(0)),new Integer(1));
		}
		else
			map.put(new Character(names[count].charAt(0)),new Integer(i.intValue()+1));
	}
	System.out.println("Number of words beginning with each letter:   ");
	printMap(map);
}
public void printMap(Map mapRef) {
	//System.out.println(mapRef.toString());
	Set<Character> keys=mapRef.keySet();
	for(Character k:keys) {
		System.out.printf("(%s,%d)\n",k,mapRef.get(k));
	}
	System.out.println("Size: "+mapRef.size());
	System.out.println("Is Empty: "+mapRef.isEmpty());
}
	public static void main(String[] args) {
		new MapTest();

	}

}
