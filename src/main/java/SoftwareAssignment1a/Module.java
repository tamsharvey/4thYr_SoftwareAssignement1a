package SoftwareAssignment1a;

import java.util.ArrayList;

public class Module
{
    private String modName;
    private String modID;
    private Lecturer lecturer;
    private ArrayList<Student> AssignedStudents;
    private ArrayList<Course> courseAssociated;

    public Module(String modName, String modID)
    {
        this.modName = modName;
        this.modID = modID;
        this.AssignedStudents = new ArrayList<Student>();
        this.courseAssociated = new ArrayList<Course>();
    }

    public String getModName()
    {
        return modName;
    }

    public void setModName(String modName)
    {
        this.modName = modName;
    }

    public String getModID()
    {
        return modID;
    }

    public void setModID(String modID)
    {
        this.modID = modID;
    }

    public Lecturer getLecturer()
    {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer)
    {
        this.lecturer = lecturer;
    }

    public ArrayList<Student> getAssignedStudents()
    {
        return AssignedStudents;
    }

    public void setAssignedStudents(ArrayList<Student> assignedStudents)
    {
        AssignedStudents = assignedStudents;
    }

    public ArrayList<Course> getCourseAssociated()
    {
        return courseAssociated;
    }

    public void setCourseAssociated(ArrayList<Course> courseAssociated)
    {
        this.courseAssociated = courseAssociated;
    }

    public void addAssignedStudents(Student student)
    {
        this.AssignedStudents.add(student);
    }

    public void addCourseAssociated(Course course)
    {
        this.courseAssociated.add(course);
    }
}
