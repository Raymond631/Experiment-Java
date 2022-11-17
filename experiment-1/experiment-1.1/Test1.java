import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个在0-1000范围内的整数：");
        int num = in.nextInt();
        if(num<0||num>1000)
        {
            System.out.println("您输入的数据有误！");
        }
        else if(num==1000)
        {
            System.out.println("各位数字之和为1");
        }
        else
        {
            int a =num/100;
            int b =num/10%10;
            int c =num%10;
            int sum = a+b+c;
            System.out.println("各位数字之和为"+sum);
        }
    }
}
