public class Circle {
    float x;
    float y;
    float radius;

    Circle(float x, float y, float radius ) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void display() {
        System.out.printf("Center = (%f,%f)\n", x, y);
        System.out.printf("Radius = %f\n", radius, null);
    }
}
