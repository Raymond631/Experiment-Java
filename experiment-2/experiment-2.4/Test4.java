import java.util.Arrays;
import java.util.Scanner;

public class Test4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("请输入整数数列list1:");
        int[] list1 = new int[in.nextInt()];
        for (int i = 0; i < list1.length; i++)
            list1[i] = in.nextInt();

        System.out.println("请输入整数数列list2:");
        int[] list2 = new int[in.nextInt()];
        for (int i = 0; i < list2.length; i++)
            list2[i] = in.nextInt();

        Arrays.sort(list1);
        Arrays.sort(list2);

        if (equal(list1, list2))
            System.out.println("这两个数列是相同的");
        else
            System.out.println("这两个数列是不同的");
    }

    public static boolean equal(int[] list1, int[] list2)
    {
        if (list1.length != list2.length)
            return false;
        else
        {
            for (int i = 0; i < list1.length; i++)
            {
                if (list1[i] != list2[i])
                    return false;
            }
            return true;
        }
    }
}
