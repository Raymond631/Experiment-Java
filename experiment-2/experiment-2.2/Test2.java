import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入10个数字：");
        double[] list = new double[10];
        for (int i = 0; i < 10; i++)
        {
            list[i] = in.nextDouble();
        }
        System.out.println("最小元素的下标为：" + indexofSmallestElement(list));
    }

    public static int indexofSmallestElement(double[] array)
    {
        double min = array[0];
        int index = 0;
        for (int i = 1; i < 10; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
