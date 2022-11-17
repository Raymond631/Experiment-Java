import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三角形的三条边、一种颜色以及一个表明该三角形是否填充的布尔值：");
        try
        {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            String color = in.next();
            boolean filled = in.nextBoolean();
            if (a + b > c && a + c > b && b + c > a)
            {
                var triangle = new Triangle(color, filled, a, b, c);
                System.out.println(triangle.toString());
            }
            else
            {
                System.out.println("输入的三条边无法构成三角形！");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("输入有误！");
        }
    }
}
