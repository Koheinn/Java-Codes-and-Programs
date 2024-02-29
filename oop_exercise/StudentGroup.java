package oop_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentGroup {
	private int capacity;
	ArrayList<Student> list;
public StudentGroup(int capacity) {
	this.capacity=capacity;
	list=new ArrayList();
}
public void addStudent(Student s) {
	if(list.size()<this.capacity) {
		list.add(s);
	}
	else {
		System.out.println("Cannot accept new Student, this group full of acceptable number of students");
	}
}
public void updateScore(Student s,double newScore) {
	s.setScores(newScore);
	
}
public void printList() {
	for(Student s:list) {
		System.out.println(s.toString());
	}
}
public void sortStudent(SortOrder o) {
	switch(o) {
	case BYID:Collections.sort(list,new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return (int)(o1.getId().compareTo(o2.getId()));
		}
		
	});break;
	case BYNAME:Collections.sort(list,new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return (int)(o1.getName().compareTo(o2.getName()));
		}
		
	});break;
	case BYSCORE:Collections.sort(list,new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return (int)(o2.getScores()-o1.getScores());
		}
		
	});break;
	}
}
}
