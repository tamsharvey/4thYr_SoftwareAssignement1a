package SoftwareAssignment1a;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student
{
    private String name;
    private int age;
    private String dob;
    private String id;
    private String userName;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, String id, String dob)
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dob = dob;
        this.courses = new ArrayList<Course>();
        this.modules = new ArrayList<Module>();
        getUserName();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getDob()
    {
        return dob;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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
