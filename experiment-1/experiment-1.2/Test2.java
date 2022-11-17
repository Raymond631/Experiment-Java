import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        double s1 = getL(x1,y1,x2,y2);
        double s2 = getL(x1,y1,x3,y3);
        double s3 = getL(x2,y2,x3,y3);

        double s = (s1+s2+s3)/2;

        double area =Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.printf("The area of the triangle is %.1f",area);

    }
    public static double getL(double x1, double y1, double x2, double y2)
    {
        double l =Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return l;
    }
}
