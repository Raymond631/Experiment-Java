public class Person
{
    private String name;
    private String phone;

    public Person(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    public String getName()
    {
        return name;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }

    @Override
    public String toString()
    {
        return "Person类：姓名为" + getName() + ",电话为" + getPhone();
    }
}
