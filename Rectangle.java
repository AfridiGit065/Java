import java.awt.*;

import static java.lang.Math.sqrt;

public class Rectangle extends Shape2D {
    public Rectangle(int length, int width) {
        super(length,width);
    }
    double diagonal(){
        return Math.sqrt(length * length + width * width);
    }

}
