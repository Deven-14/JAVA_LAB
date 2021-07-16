import java.util.LinkedList;

abstract class Student
{
	String name;
	String usn;
	int[] marks;

	Student()
	{
		marks = new int[3];
	}
	
	String getName()
	{
		return name;
	}

	String getUsn()
	{
		return usn;
	}

	int[] getMarks()
	{
		return marks;
	}
	
	public String toString() {
		
		String s = "Name : " + name + " | USN : " + usn;
		return s;
	}
}


interface College
{
	String getCollegeName();
	String getCollegeCode();
	boolean isCollegeStudent(Student s);
	void addStudent(Student s);
}

final class BmsceStudent extends Student
{
	BmsceStudent(String name, String usn, int[] marks)
	{
		this.name = name;
		this.usn = "1BM19IS" + usn;
		this.marks = marks;
	}
	
}

final class BmsITStudent extends Student
{
	BmsITStudent(String name, String usn, int[] marks)
	{
		this.name = name;
		this.usn = "1BY19IS" + usn;
		this.marks = marks;
	}
	
}

final class Bmsce implements College
{
	final String collegeName;
	final String collegeCode;
	LinkedList<Student> students;

	Bmsce()
	{
		collegeCode = "BM";
		collegeName = "Bmsce";
		students = new LinkedList<>();
	}

	public String getCollegeName() {
		return collegeName;
	}
	
	public String getCollegeCode() {
		return null;
	}
	
	public boolean isCollegeStudent(Student s) {
		
		if(s.usn.contains(collegeCode))
			return true;
		else
			return false;
	}

	public void addStudent(Student s)
	{	
		if(isCollegeStudent(s) == false)
			return;
		else
			students.add(s);
	}
	
	public String toString()
	{
		String s = "College Name : " + collegeName + "\nCollegeCode : " + collegeCode + "\nStudents : ";
		s += students.toString();
		return s;
	}
}

class StudentDemo
{
	public static void main(String[] args)
	{
		int[] marks1 = {9, 9, 9};
		BmsceStudent student1 = new BmsceStudent("deven", "048", marks1);
		int[] marks2 = {8, 9, 8};
		BmsITStudent student2 = new BmsITStudent("dev2", "052", marks2);
		int[] marks3 = {7, 7, 7};
		BmsceStudent student3 = new BmsceStudent("dev3", "042", marks3);

		Bmsce bmsce = new Bmsce();
		
		bmsce.addStudent(student1);
		bmsce.addStudent(student2);
		bmsce.addStudent(student3);

		System.out.println(bmsce);

	}
}