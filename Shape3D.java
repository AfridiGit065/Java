class Shape3D extends Shape2D {
    int height;

    public Shape3D(int length, int width, int height) {
            super(length, width);
            this.height = height;
        }

        public double volume() {
        double v = area() * height;
        return v;
        }
    public double surfaceArea() {
        double SA= 2 * (length * width + width * height + height * length);
        return SA;
    }

}
