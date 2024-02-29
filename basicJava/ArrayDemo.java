package basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter input vector:");
	String st=ip.nextLine();
	
	String stArr[]=st.split(",");
	int num[] = new int[stArr.length];
	int i=0;
	for(String n:stArr) {
		num[i]=Integer.parseInt(n);	
		i++;
	}
	List<Integer>freq=findFrequency(num);
	System.out.println();
	System.out.println(freq);
	findMode(num,freq);
	double mean=calMean(num);
    //Arrays.sort(num);
	System.out.printf("Mean of your input data: %.2f",mean);
	int medianValue=median(num);
	System.out.println("Median of input data: "+medianValue);
}
	private static List<Integer> findFrequency(int []n) {
		Arrays.sort(n);
		display(n);
		int count=1;
		
		List<Integer> freq=new ArrayList<Integer>();
		for(int i=0;i<n.length;i=i+count) {
			count=1;
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					count++;
				}
			}
			
			
		    
				freq.add(count);
			
			
		}
		return freq;
		
	}
	static void findMode(int n[],List<Integer> freq) {
		int max=Collections.max(freq);
		Arrays.sort(n);
	
		//System.out.println(max);	
			for(int j=0;j<freq.size();j++) {
				int modeid=0;
				if(max==freq.get(j)) {
					if(j>0) {
						for(int k=j-1;k>=0;k--) {
							modeid+=freq.get(k);
						}
						System.out.println("modes "+n[modeid]);
					}
					else {
						System.out.println("modes "+n[j]);
					}
					
				}
		}
		
		}
		
		
		
	
	static double calMean(int n[]) {
		int sum=0;
		double meanResult=0;
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}
		meanResult=(double)sum/n.length;
		return meanResult;
		
	}
	static int median(int n[]) {
		System.out.println("Elements after sort: ");
		Arrays.sort(n);
	
		display(n);
		System.out.println();
		int mid=n.length/2;
		int median=0;
		if(n.length %2==0){
			median=(n[mid]+n[mid-1])/2;
		}
		else{
			median=n[mid];
		}
		return median;
	}
	static void display(int num[]) {
		for(int i:num) {
			System.out.printf("%d,",i);
		}
	}
}
