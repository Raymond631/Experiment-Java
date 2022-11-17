public class Test3
{
    public static void main(String[] args)
    {
        GeometricObject[] geo = new GeometricObject[5];
        geo[0] = new GeometricObject();
        geo[1] = new GeometricObject("red", true);
        geo[2] = new Square();
        geo[3] = new Square(5);
        geo[4] = new Square("blue", false, 7);
        for (int i = 0; i < 5; i++)
        {
            System.out.print("对象" + i + "：");
            if (geo[i] instanceof Square)
            {
                ((Square) geo[i]).howToColor();
            }
            else
                System.out.println("不可着色");
        }
    }
}
