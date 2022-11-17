public class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle a = new Rectangle(4, 40);
        Rectangle b = new Rectangle(3.5, 35.9);

        System.out.println("矩形a的宽为" + a.getWidth() + ",高为" + a.getHeight() + ",面积为" + a.getArea() + ",周长为" + a.getPerimeter());
        System.out.println("矩形b的宽为" + b.getWidth() + ",高为" + b.getHeight() + ",面积为" + b.getArea() + ",周长为" + b.getPerimeter());
    }
}
