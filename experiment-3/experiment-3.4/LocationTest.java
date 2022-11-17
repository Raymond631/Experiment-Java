import java.util.Scanner;

public class LocationTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入二维数组的行数和列数:");
        int row = in.nextInt();
        int column = in.nextInt();

        System.out.println("请输入数组:");
        var array = new double[row][column];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                array[i][j] = in.nextDouble();
            }
        }

        System.out.println("最大元素及其下标是:" + Location.locateLargetst(array).maxValue + "在(" + Location.locateLargetst(array).row + "," + Location.locateLargetst(array).column + ")")
        ;
    }
}
