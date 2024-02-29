package oop_exercise;

public class StudentGroupTester {

	public static void main(String[] args) {
		StudentGroup g=new StudentGroup(3);
		g.addStudent(new Student("111","Aung Aung",2.3));
		g.addStudent(new Student("222","Tun Tun",3.3));
		g.addStudent(new Student("333","Aye Su",3.5));
		g.sortStudent(SortOrder.BYID);
		System.out.println("by id");
		g.printList();
		System.out.println("by Name");
		g.sortStudent(SortOrder.BYNAME);
		g.printList();
		System.out.println("by Scores");
		g.sortStudent(SortOrder.BYSCORE);
		g.printList();


	}

}
