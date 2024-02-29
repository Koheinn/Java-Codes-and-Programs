package oop_exercise;

public class Student {
private String id;
private String name;
private double scores;
public Student(String id, String name) {
	this(id,name,-1.0);
	
}
public Student(String id, String name, double scores) {
	super();
	this.id = id;
	this.name = name;
	this.scores = scores;
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
public double getScores() {
	return scores;
}
public void setScores(double scores) {
	this.scores = scores;
}
public Student withScore(String id,String name,double s) {
	return new Student(id,name,s);
}
@Override
public String toString() {
	
	return String.format("ID: %s,Name: %s,Scores: %.2f\n",this.getId(),this.getName(),this.getScores());
}

}
