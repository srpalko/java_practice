package chapter12_exception_handling_and_text_io;

public class InvalidRadiusException extends Exception
{
    private double radius;

    /**
     * Construct an exception
     */
    public InvalidRadiusException(double radius)
    {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    /** return the radius */
    public double getRadius()
    {
        return radius;
    }
}
