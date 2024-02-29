package basicJava;

public class SumOdd {

	public static void main(String[] args) {
		int num[]= {12, 34, 59, 45, 22};
		int oddSum=0;
		for(int i:num) {
			if(i%2!=0)
				oddSum+=i;
		}
		System.out.println("\'Sum of odd array elements: "+oddSum+ "\'");
		System.out.println("12\\12\\2022");
	}

}
