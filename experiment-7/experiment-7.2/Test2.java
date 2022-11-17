import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2
{
    public static void main(String[] args)
    {
        int characters = 0;
        int words = 0;
        int lines = 0;
        String s;

        File file = new File(args[0]);
        try
        {
            Scanner in = new Scanner(file);
            while (in.hasNext())
            {
                s = in.nextLine();
                lines++;
                for (int i = 0; i < s.length(); i++)
                {
                    if (s.charAt(i) != ' ')
                        characters++;
                    else
                        words++;
                }
            }
            in.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("characters:" + characters);
        System.out.println("words:" + words);
        System.out.println("lines:" + lines);
    }
}
