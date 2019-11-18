package nuigalway.app;

import java.time.LocalDate;
import java.util.*;

import nuigalway.app.Module;
import nuigalway.app.Student;

public class Course
{
	private String courseName;
	private List<Module> modules = new ArrayList<Module>();
	private List<Student> students = new ArrayList<Student>();
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String courseName, LocalDate startDate, LocalDate endDate) {
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
	
	public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
	
	public LocalDate getStartDate() {
        return startDate;
    }
	
	public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

}
