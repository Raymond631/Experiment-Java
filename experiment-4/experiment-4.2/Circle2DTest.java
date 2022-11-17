public class Circle2DTest
{
    public static void main(String[] args)
    {
        var c1 = new Circle2D(2, 2, 5.5);
        System.out.println("圆c1的面积为" + c1.getArea() + ",周长为" + c1.getPerimeter());

        if (c1.contains(3, 3))
            System.out.println("点(3, 3)在圆c1内");
        else
            System.out.println("点(3, 3)不在圆c1内");

        if (c1.contains(new Circle2D(4, 5, 10.5)))
            System.out.println("圆心在(4,5)半径为10.5的圆 在圆c1内");
        else
            System.out.println("圆心在(4,5)半径为10.5的圆 不在圆c1内");

        if (c1.overlaps(new Circle2D(3, 5, 2.3)))
            System.out.println("圆心在(3,5)半径为2.3的圆 和圆c1重叠");
        else
            System.out.println("圆心在(3,5)半径为2.3的圆 和圆c1不重叠");
    }
}

