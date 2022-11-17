import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
        System.out.println("请输入2个整数：");
        Scanner in = new Scanner(System.in);
        int a, b, c;
        while (true)
        {
            try
            {
                a = Integer.parseInt(in.next());
                b = Integer.parseInt(in.next());
                c = a + b;
                System.out.println(a + "+" + b + "=" + c);
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("输入有误,请重新输入:");
                in.nextLine();//清空输入流
            }
        }
    }
}
