import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3
{
    public static void main(String[] args)
    {
        try
        {
            System.out.print("main() → method1()");
            method1();
        }
        catch (NullPointerException e)
        {
            System.out.println("发生了空指针异常,已被main()中的异常处理器捕获");
        }
    }

    public static void method1()
    {
        try
        {
            System.out.print(" → method2()");
            method2();
        }
        catch (InputMismatchException e)
        {
            System.out.println("发生了输入异常,已被method1()中的异常处理器捕获");
        }
    }

    public static void method2()
    {
        try
        {
            System.out.print(" → method3()");
            method3();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("发生了数组下标越界异常,已被method2()中的异常处理器捕获");
        }
    }

    public static void method3() throws ArrayIndexOutOfBoundsException, InputMismatchException, NullPointerException
    {
        int[] a = new int[10];
        int b;
        Object c = null;
        System.out.println();
        System.out.println("异常类型代号：");
        System.out.println("1：数组下标越界异常");
        System.out.println("2：输入异常");
        System.out.println("3：空指针异常");
        System.out.println("请输入想要演示的异常类型代号：");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x == 1)
            System.out.println(a[10]);
        else if (x == 2)
        {
            System.out.println("给整形变量b赋值：");
            b = in.nextInt();
        }
        else
            System.out.println(c.toString());
    }
}
