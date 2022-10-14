package SoftwareAssignment1a;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course
{
    private String name;
    private DateTime startDate;
    private DateTime endDate;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String name, DateTime startDate, DateTime endDate)
    {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = new ArrayList<Module>();
        this.students = new ArrayList<Student>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
