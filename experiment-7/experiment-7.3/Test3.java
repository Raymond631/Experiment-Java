import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Test3
{
    public static void main(String[] args)
    {
        File file = new File("./Exercise9_19.txt");
        if (!file.exists())
        {
            try
            {
                file.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        PrintWriter out = null;
        try
        {
            out = new PrintWriter(file);
            for (int i = 0; i < 10; i++)
            {
                out.print((int) (Math.random() * 10));
                out.print(" ");
            }
            out.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        Scanner in = null;
        try
        {
            in = new Scanner(file);
            int[] num = new int[10];
            for (int i = 0; i < 10; i++)
            {
                num[i] = in.nextInt();
            }
            Arrays.sort(num);
            System.out.println("排序后的结果为：");
            for (int i = 0; i < 10; i++)
            {
                System.out.print(num[i] + " ");
            }
            in.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
