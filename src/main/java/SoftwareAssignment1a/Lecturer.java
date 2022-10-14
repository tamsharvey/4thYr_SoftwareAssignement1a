package SoftwareAssignment1a;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Lecturer
{
    private String lecturerName;
    private int lecturerAge;
    private String lecturerDob;
    private String lecturerId;
    private String userName;
    private ArrayList<Course> lectureAssignedCourses;
    private ArrayList<Module> assignedModules;

    public Lecturer(String lecturerName, int lecturerAge, String lecturerId, String lecturerDob)
    {
        this.lecturerName = lecturerName;
        this.lecturerAge = lecturerAge;
        this.lecturerId = lecturerId;
        this.lecturerDob = lecturerDob;
        this.assignedModules =new ArrayList<Module>();
        this.lectureAssignedCourses = new ArrayList<Course>();
        genUserName();
    }

    private void genUserName()
    {
        this.userName = lecturerName + lecturerAge;
    }

    public String getLecturerName()
    {
        return lecturerName;
    }

    public void setLecturerName(String name)
    {
        this.lecturerName = lecturerName;
    }

    public int getLecturerAge()
    {
        return lecturerAge;
    }

    public void setLecturerAge(int lecturerAge)
    {
        this.lecturerAge = lecturerAge;
    }

    public String getLecturerDob()
    {
        return lecturerDob;
    }

    public void setLecturerDob(String lecturerDob)
    {
        this.lecturerDob = lecturerDob;
    }

    public String getLecturerIdId()
    {
        return lecturerId;
    }

    public void setLecturerIdId(String lecturerId)
    {
        this.lecturerId = lecturerId;
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
