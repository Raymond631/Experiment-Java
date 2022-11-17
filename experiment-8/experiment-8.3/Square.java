public class Square extends GeometricObject implements Colorable
{
    private double a = 1;

    public Square()
    {
        super();
    }

    public Square(double a)
    {
        super();
        this.a = a;
    }

    public Square(String color, boolean filled, double a)
    {
        super(color, filled);
        this.a = a;
    }

    public double getArea()
    {
        return a * a;
    }

    public double getPerimeter()
    {
        return 4 * a;
    }

    public void howToColor()
    {
        System.out.println("给所有的四条边着色");
    }
}
