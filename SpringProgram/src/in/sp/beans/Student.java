package in.sp.beans;

public class Student {

	private String name;
	private int rollno;
	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	String getname()
	{
		return name;
	}
	int rollno()
	{
		return rollno;
	}
	public void display()
	{
		System.out.println("Name "+ name);
		System.out.println("Roll no"+rollno);
	}
	

}

