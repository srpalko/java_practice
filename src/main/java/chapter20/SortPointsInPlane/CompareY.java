package chapter20.SortPointsInPlane;

import java.util.Comparator;

public class CompareY implements Comparator<Point>
{

    @Override
    public int compare(Point o1, Point o2)
    {
        if (o1.getY() > o2.getY())
        {
            return 1;
        } else if (o1.getY() < o2.getY())
        {
            return -1;
        } else return Double.compare(o1.getX(), o2.getX());
    }
}
