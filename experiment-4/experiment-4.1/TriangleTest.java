public class TriangleTest
{
    public static void main(String[] args)
    {
        var tri = new Triangle(1, 1.5, 1, "yellow", true);

        if (tri.isFilled())
            System.out.println(tri.toString() + ",颜色为" + tri.getColor() + ",被填充");
        else
            System.out.println(tri.toString() + ",颜色为" + tri.getColor() + ",未被填充");
    }
}
