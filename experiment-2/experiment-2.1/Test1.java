import java.util.Arrays;
import java.util.Scanner;

public class Test1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入1-100之间的整数：");
        int[] list=new int[101];
        while (true)
        {
            int x = in.nextInt();
            if(x==0)
                break;
            else
                list[x]++;
        }
        for (int i = 0; i < 101; i++)
        {
            if(list[i]!=0)
            {
                System.out.println(i+"出现"+list[i]+"次");
            }
        }
    }
}
