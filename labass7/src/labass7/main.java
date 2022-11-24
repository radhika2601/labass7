package labass7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;




class student
{
	int id;
	String name;
	int age;
	int marks;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, int age, int marks) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> students=new ArrayList<>();
		students.add(new student(1,"om",10,60));
		students.add(new student(2,"sony",11,75));
		students.add(new student(3,"shree",15,89));
		students.add(new student(4,"abc",19,79));
		students.add(new student(5,"shree",13,69));
		students.stream().forEach(s->System.out.println(s));
		students.stream().filter(s->s.getMarks()<80 && s.getMarks()>60).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));
		
	}
}

	

