import java.util.Scanner;

public class QuadraticEquationTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a,b,c的值：");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        var x = new QuadraticEquation(a, b, c);
        double d = x.getDiscriminant();
        System.out.println("判别式：" + d);
        if (d > 0)
            System.out.println("第1个根为" + x.getRoot1() + ",第2个根为" + x.getRoot2());
        else if (d == 0)
            System.out.println("唯一根为" + x.getRoot1());
        else
            System.out.println("The equation has no roots");
    }
}
