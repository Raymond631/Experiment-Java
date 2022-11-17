import java.util.Scanner;

public class Test5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个信用卡号码：");
        long num = in.nextLong();
        if (isValid(num))
            System.out.println("您输入的信用卡号码合法。");
        else
            System.out.println("您输入的信用卡号码不合法！");
    }

    /*如果卡号有效，则返回 true*/
    public static boolean isValid(long number)
    {
        if (((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)
                && (getSize(number) >= 13) && (getSize(number) <= 16)
                && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)))
            return true;
        else

            return false;
    }

    /*获取第 2 步的结果*/
    public static int sumOfDoubleEvenPlace(long number)
    {
        String s = number + "";
        int sum = 0;
        for (int i = 1; i < s.length(); i = i + 2)
        {
            int a = ((int) (s.charAt(i) - 48)) * 2;
            sum += getDigit(a);
        }
        return sum;
    }

    /*如果是一位数则返回此数，否则返回两位数之和*/
    public static int getDigit(int number)
    {
        if (number < 10)
            return number;
        else
            return (number / 10 + number % 10);
    }

    /*返回数字中奇数位的总和*/
    public static int sumOfOddPlace(long number)
    {
        String s = number + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i = i + 2)
        {
            sum += (int) (s.charAt(i) - 48);
        }
        return sum;
    }

    /*如果数字 d 是数字的前缀，则返回 true*/
    public static boolean prefixMatched(long number, int d)
    {
        if (getPrefix(number, getSize(d)) == d)
            return true;
        else
            return false;
    }

    /*返回 d 中的位数*/
    public static int getSize(long d)
    {
        String str = d + "";
        return str.length();
    }

    /*返回 number 的前 k 位数字。 如果 number 的位数小于 k，则返回 number*/
    public static long getPrefix(long number, int k)
    {
        if (getSize(number) < k)
            return number;
        else
        {
            String s1 = number + "";
            String s2 = s1.substring(0, k);
            return Long.parseLong(s2);
        }
    }
}
