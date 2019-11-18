package nuigalway.app;

import java.util.ArrayList;
import nuigalway.app.Student;
import nuigalway.app.Course;

public class Module
{
	private String moduleName;
	private String moduleID;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Module(String moduleName, String moduleID) {
		this.moduleName = moduleName;
		this.moduleID = moduleID;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public String getModuleName(){
		return moduleName;
	}
	
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	
	public String getModuleID(){
		return moduleID;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public ArrayList<Course> getCourse(){
		return courses;
	}

}