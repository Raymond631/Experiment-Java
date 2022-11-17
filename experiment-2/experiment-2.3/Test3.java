import java.util.Scanner;

public class Test3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入10个数：");
        double[] list = new double[10];

        double x;
        int index = 1;
        for (int i = 0; i < 10; i++)
        {
            if (i == 0)
                list[0] = in.nextDouble();
            else
            {
                x = in.nextDouble();
                if (isHave(list, x, index))
                {
                    list[index] = x;
                    index++;
                }
            }
        }

        for (int i = 0; i < index; i++)
        {
            System.out.print(list[i] + " ");
        }
    }

    public static boolean isHave(double[] list, double x, int index)
    {
        for (int j = 0; j < index; j++)
        {
            if (x == list[j])
                return false;
        }
        return true;
    }
}
