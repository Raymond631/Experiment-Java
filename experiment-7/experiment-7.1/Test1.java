import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
        System.out.println("请输入密码：");
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        if (detection(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    public static boolean detection(String s)
    {
        if (len(s) && type(s) && number(s))
            return true;
        else
            return false;
    }

    public static boolean len(String s)
    {
        return s.length() >= 8;
    }

    public static boolean type(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if ((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
                continue;
            else
                return false;
        }
        return true;
    }

    public static boolean number(String s)
    {
        int temp = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
                temp++;
        }
        return temp >= 2;
    }
}
