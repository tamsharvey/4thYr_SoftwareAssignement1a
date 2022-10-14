package SoftwareAssignment1a;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student
{
    private String studentName;
    private int studentAge;
    private String studentDob;
    private String studentId;
    private String userName;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String studentName, int studentAge, String studentId, String studentDob)
    {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentId = studentId;
        this.studentDob = studentDob;
        this.courses = new ArrayList<Course>();
        this.modules = new ArrayList<Module>();
        genUserName();
    }

    private void genUserName()
    {
        this.userName = studentName + studentAge;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String name)
    {
        this.studentName = studentName;
    }

    public int getStudentAge()
    {
        return studentAge;
    }

    public void setStudentAge(int studentAge)
    {
        this.studentAge = studentAge;
    }

    public String getStudentDob()
    {
        return studentDob;
    }

    public void setStudentDob(String studentDob)
    {
        this.studentDob = studentDob;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses)
    {
        this.courses = courses;
    }

    public ArrayList<Module> getModules()
    {
        return modules;
    }

    public void setModules(ArrayList<Module> modules)
    {
        this.modules = modules;
    }

    public void addCourses(Course course)
    {
        this.courses.add(course);
    }

    public void addModules(Module module)
    {
        this.modules.add(module);
    }
}
