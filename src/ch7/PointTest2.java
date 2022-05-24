package ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3DCh7_2 p3 = new Point3DCh7_2();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class PointCh7_2 {
    int x = 10;
    int y = 20;

    PointCh7_2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3DCh7_2 extends PointCh7 {
    int z = 30;

    Point3DCh7_2() {
        this(100, 200, 300);
    }

    Point3DCh7_2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
