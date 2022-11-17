public class Triangle extends GeometricObject
{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c)
    {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, boolean filled, double a, double b, double c)
    {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea()
    {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter()
    {
        return a + b + c;
    }

    @Override
    public String toString()
    {
        return "面积：" + getArea() + ",周长：" + getPerimeter() + ",颜色：" + getColor() + ",是否被填充：" + isFilled();
    }
}
