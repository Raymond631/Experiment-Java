import java.util.Scanner;

public class MyStackTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入5个字符串：");
        MyStack<String> stack = new MyStack<>();
        String a;
        for (int i = 0; i < 5; i++)
        {
            a = in.nextLine();
            stack.push(a);
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(stack.pop());
        }
    }
}
