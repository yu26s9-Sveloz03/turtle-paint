import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);

//        Draws an X
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);

        // draws a square

//        turtle.setPenWidth(3);
//        turtle.setColor(Color.magenta);
//
//        turtle.forward(width);
//        turtle.turnRight(90);
//        turtle.forward(width);
//        turtle.turnRight(90);
//        turtle.forward(width);
//        turtle.turnRight(90);
//        turtle.forward(width);

        //Draws a circle

//        turtle.setPenWidth(3);
//        turtle.setColor(Color.blue);
//        turtle.penUp();
//        turtle.goTo(0,-100);
//        turtle.penDown();
//
//
//        int i = 0;
//        while (i < 360){
//            turtle.forward(1);
//            turtle.turnLeft(1);
//            i++;
//        }

        //Draws 3/4 circle red and the other 1/4 blue

        turtle.setPenWidth(3);
        turtle.setColor(Color.red);
        turtle.penUp();
        turtle.goTo(0,0);
        turtle.penDown();
        turtle.forward(57.3);
        turtle.turnLeft(90);

        int i = 0;
        while (i < 270){
            turtle.forward(1);
            turtle.turnLeft(1);
            i++;
        }

        turtle.turnLeft(90);
        turtle.forward(57.3);
        turtle.penUp();
        turtle.goTo(10,-10);

        turtle.setColor(Color.blue);
        turtle.penDown();
        turtle.turnRight(90);
        turtle.forward(57.3);
        turtle.turnRight(90);

        int i2 = 0;
        while (i2 < 90){
            turtle.forward(1);
            turtle.turnRight(1);
            i2++;
        }

        turtle.turnRight(90);
        turtle.forward(57.3);
    }
}
