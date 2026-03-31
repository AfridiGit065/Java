import java.awt.*;

public class Circle extends Shape2D {
    int radius;

    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public double area() {
        double d= (Math.PI*length*length);
        return d;
    }
    @Override
    public double perimeter() {
        return  (2 * Math.PI * length);
    }


}