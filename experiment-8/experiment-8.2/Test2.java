import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入2个圆的半径：");
        var circle1 = new ComparableCircle(in.nextDouble());
        var circle2 = new ComparableCircle((in.nextDouble()));

        switch (circle1.compareTo(circle2))
        {
            case -1:
                System.out.println("circle1 比 circle2 小");
                break;
            case 0:
                System.out.println("circle1 与 circle2 相等");
                break;
            case 1:
                System.out.println("circle1 比 circle2 大");
                break;
        }
    }
}
