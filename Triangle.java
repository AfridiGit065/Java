import java.awt.*;

public class Triangle extends Shape2D{
    int base=length;
    int height=width;

    public Triangle(int height, int base) {
        super(height,base);
    }
    @Override
    public double area() {
        double a=(length * width) /2;
        return a;
    }
    @Override
    public double perimeter() {
        int p= 3 * length;
        return p;
    }

}
