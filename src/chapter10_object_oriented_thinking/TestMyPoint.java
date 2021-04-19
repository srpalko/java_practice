package chapter10_object_oriented_thinking;

public class TestMyPoint
{
    public static void main(String[] args)
    {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("The distance between point1 and point2 is " + point1.distance(point2));
        System.out.println("Done statically " + MyPoint.distance(point1, point2));
    }
}
