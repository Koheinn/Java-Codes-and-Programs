package OOP;

public class Student {
private String id;
private String name;
private int age;
private String className;
public Student(String id, String name, int age, String className) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.className = className;
}


public Student() {
	this.id="unknown";
	this.name="unknown";
	this.className="unknown";
	this.age=0;
}



public void display() {
	System.out.println("Student's Id: "+this.id);
	System.out.println("Student's Name: "+this.name);
	System.out.println("Student's Class: "+this.className);
	System.out.println("Student's Age: "+this.age);
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getClassName() {
	return className;
}


public void setClassName(String className) {
	this.className = className;
}

}
