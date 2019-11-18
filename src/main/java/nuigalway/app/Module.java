package nuigalway.app;

import java.util.*;
import nuigalway.app.Student;
import nuigalway.app.Course;

public class Module
{
	private String moduleName;
	private String moduleID;
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
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
	
	public List<Student> getStudents(){
		return students;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public List<Course> getCourse(){
		return courses;
	}

}