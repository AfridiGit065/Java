import java.awt.*;

public class Sphere extends Shape3D {
        public Sphere(int radius) {
            super(radius, radius, radius);
        }

        @Override
        public double volume() {
            return  ((4.0 / 3.0) * Math.PI * length * length * length);
        }

        @Override
        public double surfaceArea() {
            return (4 * Math.PI * length * length);
        }
}
