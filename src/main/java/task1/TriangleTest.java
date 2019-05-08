package task1;

public class TriangleTest {

    public static void main(String[] args) throws IllegalArgumentException {
        //Formula and area calc test is here: https://www.mathopenref.com/coordtrianglearea.html
        TriangleVertex triangleVertexA = new TriangleVertex(15, 15);
        TriangleVertex triangleVertexB = new TriangleVertex(23, 30);
        TriangleVertex triangleVertexC = new TriangleVertex(50, 25);

        Triangle triangle = new Triangle(triangleVertexA, triangleVertexB, triangleVertexC);
        System.out.println(triangle.getArea());

        TriangleVertex triangleVertexA0 = new TriangleVertex(0, 0);
        TriangleVertex triangleVertexB0 = new TriangleVertex(0, 0);
        TriangleVertex triangleVertexC0 = new TriangleVertex(0, 0);

        Triangle triangle0 = new Triangle(triangleVertexA0, triangleVertexB0, triangleVertexC0);
        System.out.println(triangle0.getArea());
    }
}


