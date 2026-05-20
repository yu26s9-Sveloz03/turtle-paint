import java.awt.*;

public abstract class Shape {

    private Turtle turtle;
    private Point location;
    private Color color;
    private int width;

    public Shape(Point location, Color color, int width) {
        this.location = location;
        this.color = color;
        this.width = width;
        World world = new World(width,width);
        this.turtle = new Turtle(world);
    }

    public abstract void paint();
}
