package chapter20.SortPointsInPlane;

public class Point implements Comparable<Point>
{
    private final double x;
    private final double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    @Override
    public int compareTo(Point o)
    {
        if (this.x > o.x)
        {
            return 1;
        } else if (this.x < o.x)
        {
            return -1;
        } else return Double.compare(this.y, o.y);
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
