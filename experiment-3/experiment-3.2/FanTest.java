public class FanTest
{
    public static void main(String[] args)
    {
        var a = new Fan();
        a.setSpeed(Fan.FAST);
        a.setRadius(10);
        a.setColor("yellow");
        a.setOn(true);

        var b = new Fan();
        b.setSpeed(Fan.MEDIUM);
        b.setRadius(5);
        b.setColor("blue");
        b.setOn(false);

        System.out.println("风扇a：" + a.toString());
        System.out.println("风扇b：" + b.toString());
    }
}
