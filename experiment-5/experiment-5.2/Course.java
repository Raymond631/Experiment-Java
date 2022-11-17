import java.util.ArrayList;

public class Course
{
    private String courseName;
    private ArrayList<String> students = new ArrayList<String>(100);
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student)
    {
        students.add(numberOfStudents, student);
        numberOfStudents++;
    }

    public String[] getStudents()
    {
        var a = new String[students.size()];
        return students.toArray(a);
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void dropStudent(String student)
    {
        students.remove(student);
        numberOfStudents--;
    }

}
