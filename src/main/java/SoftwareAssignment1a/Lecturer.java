package SoftwareAssignment1a;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Lecturer
{
    private String name;
    private int age;
    private String dob;
    private String id;
    private String userName;
    private ArrayList<Course> lectureAssignedCourses;
    private ArrayList<Module> assignedModules;

    public Lecturer(String name, int age, String id, String dob)
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dob =dob;
        this.assignedModules =new ArrayList<Module>();
        this.lectureAssignedCourses = new ArrayList<Course>();
        genuserName();
    }

    private void genuserName()
    {
        this.userName = name + age;
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

    public ArrayList<Course> getLectureAssignedCourses()
    {
        return lectureAssignedCourses;
    }

    public void setLectureAssignedCourses(ArrayList<Course> lectureAssignedCourses)
    {
        this.lectureAssignedCourses = lectureAssignedCourses;
    }

    public ArrayList<Module> getAssignedModules()
    {
        return assignedModules;
    }

    public void setAssignedModules(ArrayList<Module> assignedModules)
    {
        this.assignedModules = assignedModules;
    }

    public void addAssignedModules(Module module)
    {
        this.assignedModules.add(module);
    }
}
