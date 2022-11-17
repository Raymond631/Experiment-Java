public class Employee extends Person
{
    private double salary;
    private MyDate employDate;

    public Employee(String name, String phone, double salary, int y, int m, int d)
    {
        super(name, phone);
        this.salary = salary;
        this.employDate = new MyDate(y, m, d);
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public MyDate getEmployDate()
    {
        return employDate;
    }

    @Override
    public String toString()
    {
        return "Employee类：姓名为" + getName() + ",电话为" + getPhone() + ",工资为" + getSalary() + ",受聘日期为" + getEmployDate();
    }

    public void displayObject()
    {
        System.out.println("to " + getName() + "：请按时上班");
    }

}
