package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3DCh7 p3 = new Point3DCh7(1, 2, 3);
    }
}

class PointCh7 {
    int x, y;

    PointCh7(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointCh7() {

    }

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3DCh7 extends PointCh7 {
    int z;

    Point3DCh7(int x, int y, int z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}
