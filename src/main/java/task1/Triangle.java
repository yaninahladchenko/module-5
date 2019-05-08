package task1;

public class Triangle {
    private TriangleVertex a;
    private TriangleVertex b;
    private TriangleVertex c;

    public Triangle(TriangleVertex a, TriangleVertex b, TriangleVertex c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() throws IllegalArgumentException {
        double area = Math.abs((a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2);;
        if (area == 0) {
            throw new IllegalArgumentException("Triangle area is 0");
        }
        return area;
    }

}