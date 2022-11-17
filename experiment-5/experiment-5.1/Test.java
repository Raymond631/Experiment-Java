public class Test
{
    public static void main(String[] args)
    {
        Person person = new Person("张三", "11111111111");
        Person student = new Student("李四", "22222222222", Student.GRADE1);
        Person employee = new Employee("赵五", "33333333333", 10000, 2022, 5, 13);
        m1(person);
        m2(person);
        m3(person);

        m1(student);
        m2(student);
        m3(student);

        m1(employee);
        m2(employee);
        m3(employee);
    }

    public static void m1(Person p)
    {
        System.out.println("姓名：" + p.getName());
    }

    public static void m2(Person p)
    {
        System.out.println(p.toString());
    }

    public static void m3(Person p)
    {
        if (p instanceof Student a)
        {
            a.displayObject();
        }
        if (p instanceof Employee b)
        {
            b.displayObject();
        }
    }

}
