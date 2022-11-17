public class Student extends Person
{
    public final static String GRADE1 = "大一";
    public final static String GRADE2 = "大二";
    public final static String GRADE3 = "大三";
    public final static String GRADE4 = "大四";
    private String grade;

    public Student(String name, String phone, String grade)
    {
        super(name, phone);
        this.grade = grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getGrade()
    {
        return grade;
    }

    @Override
    public String toString()
    {
        return "Student类：姓名为" + getName() + ",电话为" + getPhone() + ",年级为" + getGrade();
    }

    public void displayObject()
    {
        System.out.println("to " + getName() + "：请按时交实验报告");
    }
}
