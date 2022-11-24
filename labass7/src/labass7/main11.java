package labass7;

import java.util.ArrayList;
import java.util.List;

class student1
{
	int id;
	String name;
	int age;
	int marks;
	
	public student1(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public student1() {
		super();
		// TODO Auto-generated constructor stub
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
public class main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student1> students1=new ArrayList<>();
		students1.add(new student1(1,"om",10,60));
		students1.add(new student1(2,"sony",11,75));
		students1.add(new student1(3,"shree",15,89));
		students1.add(new student1(4,"abc",19,79));
		students1.add(new student1(5,"shree",13,69));
		student1 dMax = students1.stream().max((stud1,stud2)->stud1.getMarks()>stud2.getMarks()?1:-1).get();
		System.out.println(dMax.getId()+" "+dMax.getName()+" "+dMax.getMarks());
		System.out.println("**********************************");
		student1 dmin = students1.stream().min((stud1,stud2)->stud1.getMarks()>stud2.getMarks()?1:-1).get();
		System.out.println(dmin.getId()+" "+dmin.getName()+" "+dmin.getMarks());
		
	}

}
