import java.lang.*;

class Student
{
	private int sId;
	private String sName;
	private int[] marks;
	
	Student()
	{
		marks = new int[3];
	}

	void setSId(int id){ sId = id; }
	void setSName(String name) { sName = name; }
	void setMarks(int[] m)
	{
		for(int i = 0; i < 3; ++i)
			marks[i] = m[i];
	}
	
	int getSId() { return sId; }
	String getSName() { return sName; }
	void getMarks() 
	{
		System.out.print("Student Marks : ");
		for(int i = 0; i < 3; ++i)
			System.out.print(marks[i] + " ");
		System.out.println();
	}

	double getAverage()
	{
		int sum = 0;
		for(int i = 0; i < 3; ++i)
			sum += marks[i];
		return sum/3;
	}
	
	public static void main(String[] args)
	{
		Student s = new Student();
		s.setSId(12345);
		s.setSName("dev");
		int m1 = Integer.parseInt(args[0]);
		int m2 = Integer.parseInt(args[1]);
		int m3 = Integer.parseInt(args[2]);
		int[] marks = {m1, m2, m3};
		s.setMarks(marks);
		System.out.println("Student Id : " + s.getSId());
		System.out.println("Student Name : " + s.getSName());
		s.getMarks();
		System.out.println("Student Average Marks : " + s.getAverage());
	}
}