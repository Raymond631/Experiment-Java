public class Fan
{
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean getOn(boolean on)
    {
        return on;
    }

    public void setOn(boolean on)
    {
        this.on = on;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String toString()
    {
        String description;
        if (on)
        {
            description = "风扇的速度为" + speed + ",颜色为" + color + ",半径为" + radius;
        }
        else
        {
            description = "fan is off" + ",颜色为" + color + ",半径为" + radius;
        }
        return description;
    }
}
