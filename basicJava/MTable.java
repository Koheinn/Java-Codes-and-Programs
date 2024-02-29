package basicJava;

public class MTable {

	public static void main(String[] args) {
		for(int counter1=1;counter1<=12;counter1++) {
			for(int counter2=1;counter2<=12;counter2++) {
				System.out.printf("%d x %d=%d\n",counter1,counter2,(counter1*counter2));
			}
			System.out.println();
		}

	}

}
