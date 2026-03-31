public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 2);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle Diagonal: " + rectangle.diagonal());

        Circle circle = new Circle(3);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Triangle triangle = new Triangle(6, 8);
        System.out.println("Triangle Area: " + triangle.area());

        Cuboid cuboid = new Cuboid(3, 2, 4);
        System.out.println("Cuboid Volume: " + cuboid.volume());
        System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());

        Sphere sphere = new Sphere(3);
        System.out.println("Sphere Volume: " + sphere.volume());
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());
    }
}
