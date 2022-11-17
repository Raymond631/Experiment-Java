import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        int[] num = new int[100];
        for (int i = 0; i < 100; i++)
        {
            num[i] = (int) (Math.random() * 100);
        }
        System.out.println("请输入数组下标：");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        try
        {
            System.out.println(num[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of bounds!");
        }
    }
}
