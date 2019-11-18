package nuigalway.app;

public class Student
{
	private int age;
	private String name;
	private String DOB;
	private String ID;
	
	public Student(String name, int age, String DOB, String ID) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	
	public String getDOB(){
		return DOB;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getID(){
		ID = name + age;
		return ID;
	}

}