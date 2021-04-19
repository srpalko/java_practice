package chapter10_object_oriented_thinking;

public class MyPoint
{
    private double x;
    private double y;

    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public MyPoint()
    {
        this(0, 0);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance(MyPoint point)
    {
        return MyPoint.distance(this, point);
    }

    public double distance(double x, double y)
    {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public static double distance(MyPoint p1, MyPoint p2)
    {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
