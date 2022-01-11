package chapter9_objects_classes;

public class Fan
{
    private static final int SLOW = 1, MEDIUM = 2, FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";





    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean isOn()
    {
        return on;
    }

    public void setOn(boolean on)
    {
        this.on = on;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        if (!on)
        {
            return "Fan color: " + color + ", Radius: " + radius + ", fan is off.";
        }
        else
        {
            return "Fan speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        }
    }


    public static void main(String[] args)
    {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(Fan.MEDIUM);

        System.out.println(fan1);
        System.out.println(fan2);
    }



}
