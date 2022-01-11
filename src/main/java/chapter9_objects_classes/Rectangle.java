package chapter9_objects_classes;

public class Rectangle
{
    private double width;
    private double height;

    public Rectangle()
    {
        this(1, 1);
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * width + 2 * height;
    }

    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("rect1 width is " + rect1.width);
        System.out.println("rect1 height is " + rect1.height);
        System.out.println("rect1 area is " + rect1.getArea());
        System.out.println("rect1 perimeter is " + rect1.getPerimeter());

        System.out.println("rect2 width is " + rect2.width);
        System.out.println("rect2 height is " + rect2.height);
        System.out.println("rect2 area is " + rect2.getArea());
        System.out.println("rect2 perimeter is " + rect2.getPerimeter());
    }
}
