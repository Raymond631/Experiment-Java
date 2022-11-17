public class Circle2D
{
    private double x;
    private double y;
    private double radius;

    public Circle2D()
    {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return 3.14159 * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * 3.14159 * radius;
    }

    public boolean contains(double x, double y)
    {
        double d = (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y);
        if (d < radius * radius)
            return true;
        else
            return false;
    }

    public boolean contains(Circle2D circle)
    {
        double d = (this.x - circle.x) * (this.x - circle.x) + (this.y - circle.y) * (this.y - circle.y);
        if (d < (this.radius - circle.radius) * (this.radius - circle.radius))
            return true;
        else
            return false;
    }

    public boolean overlaps(Circle2D circle)
    {
        double d = (this.x - circle.x) * (this.x - circle.x) + (this.y - circle.y) * (this.y - circle.y);
        if (d < (this.radius + circle.radius) * (this.radius + circle.radius) && d > (this.radius - circle.radius) * (this.radius - circle.radius))
            return true;
        else
            return false;
    }
}