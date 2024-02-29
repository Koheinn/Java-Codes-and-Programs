package OOP;

public class StudentUser {

	
	public static void main(String[] args) {
		Student stu=new Student();
		Student stu2=new Student("itc_001234","Thiri",17,"L3DC");
		System.out.println("Data of student one");
		System.out.println("before updating");
		stu.display();	
		System.out.println("Data of student two");
		stu2.display();
		stu.setName("Mg Mg");
		stu.setAge(17);
		stu.setId("it_00987");
		stu.setClassName("L4DC");
		System.out.println("After updating");
		stu.display();
		
	}

}
