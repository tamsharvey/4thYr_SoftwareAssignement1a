package SoftwareAssignment1a;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course
{
    private String CourseName;
    private DateTime startDate;
    private DateTime endDate;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String CourseName, DateTime startDate, DateTime endDate)
    {
        this.CourseName = CourseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = new ArrayList<Module>();
        this.students = new ArrayList<Student>();
    }

    public String getCourseName()
    {
        return CourseName;
    }

    public void setCourseName(String CourseName)
    {
        this.CourseName = CourseName;
    }

    public DateTime getStartDate()
    {
        return startDate;
    }

    public void setStartDate(DateTime startDate)
    {
        this.startDate = startDate;
    }

    public DateTime getEndDate()
    {
        return endDate;
    }

    public void setEndDate(DateTime endDate)
    {
        this.endDate = endDate;
    }

    public ArrayList<Module> getModules()
    {
        return modules;
    }

    public void setModules(ArrayList<Module> modules)
    {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }

    public void setStudents(ArrayList<Student> students)
    {
        this.students = students;
    }

    public void addModules(Module module)
    {
        modules.add(module);
    }

    public void addStudents(Student student)
    {
        students.add(student);
    }

}
