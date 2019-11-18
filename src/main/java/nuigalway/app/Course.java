package nuigalway.app;

<<<<<<< HEAD
import org.joda.time.*;
import java.util.ArrayList;
=======
import java.time.LocalDate;
import java.util.*;

>>>>>>> 27a2784277e0c55181985c37ca390ef1f6fc2c7e
import nuigalway.app.Module;
import nuigalway.app.Student;

public class Course
{
	private String courseName;
<<<<<<< HEAD
	private ArrayList<Module> modules = new ArrayList<Module>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String courseName, DateTime startDate, DateTime endDate) {
=======
	private List<Module> modules = new ArrayList<Module>();
	private List<Student> students = new ArrayList<Student>();
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String courseName, LocalDate startDate, LocalDate endDate) {
>>>>>>> 27a2784277e0c55181985c37ca390ef1f6fc2c7e
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
	
<<<<<<< HEAD
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
=======
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
>>>>>>> 27a2784277e0c55181985c37ca390ef1f6fc2c7e
        return endDate;
    }

}
