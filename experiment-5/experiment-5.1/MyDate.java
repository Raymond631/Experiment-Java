public class MyDate
{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getMonth()
    {
        return month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getDay()
    {
        return day;
    }

    @Override
    public String toString()
    {
        return "MyDate类：年份为" + getYear() + ",月份为" + getMonth() + ",日期为" + getDay();
    }
}
