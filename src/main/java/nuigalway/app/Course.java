package nuigalway.app;

import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;
import nuigalway.app.Module;
import nuigalway.app.Student;

public class Course
{
	private String courseName;
	private List<Module> modules = new ArrayList<Module>();
	private List<Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String courseName, DateTime startDate, DateTime endDate) {
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}
	
	public List<Module> getModules(){
		return modules;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
	
	public DateTime getStartDate() {
        return startDate;
    }
	
	public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

}
