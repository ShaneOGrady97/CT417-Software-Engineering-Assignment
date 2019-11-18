package nuigalway.app;

<<<<<<< HEAD
import java.util.ArrayList;
import nuigalway.app.Course;
import nuigalway.app.Student;
=======
import java.util.*;
import nuigalway.app.Student;
import nuigalway.app.Course;
>>>>>>> 27a2784277e0c55181985c37ca390ef1f6fc2c7e

public class Module
{
	private String moduleName;
	private String moduleID;
<<<<<<< HEAD
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
=======
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
>>>>>>> 27a2784277e0c55181985c37ca390ef1f6fc2c7e
	
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