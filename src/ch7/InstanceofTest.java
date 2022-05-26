package ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine1 fe = new FireEngine1();

        if (fe instanceof FireEngine1) {
            System.out.println("This is FireEngine1 instance");
        }
        if (fe instanceof Car1) {
            System.out.println("This is Car1 instance");
        }
        if (fe instanceof Object) {
            System.out.println("This is Object instance");
        }
        System.out.println(fe.getClass().getName());
    }
}

class Car1 {}
class FireEngine1 extends Car1 {}
