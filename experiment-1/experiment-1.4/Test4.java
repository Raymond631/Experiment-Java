public class Test4 {
    public static void main(String[] args) {
        int temp=0;
        for (int i = 100; i <=200 ; i++) {
            if((isDivisibleBy_5(i) || isDivisibleBy_6(i)) && !(isDivisibleBy_5(i) && isDivisibleBy_6(i)))
            {
                System.out.print(i+" ");
                temp++;
                if(temp%10==0 && temp !=0)
                    System.out.println();
            }
        }
    }
    public static boolean isDivisibleBy_5(int a)
    {
        if(a%5==0)
            return true;
        else
            return false;
    }
    public static boolean isDivisibleBy_6(int b)
    {
        if(b%6==0)
            return true;
        else
            return false;
    }
}
