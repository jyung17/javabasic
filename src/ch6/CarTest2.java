package ch6;
class Car1 {
    String color;
    String gearType;
    int door;

    Car1(){
        this("white", "auto", 4);
    }

    Car1(String color) {
        this(color, "autho", 4);
    }

    Car1(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}
public class CarTest2 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car1 car2 = new Car1("blue");

        System.out.println("car1의 color=" + car1.color + ", gearType=" + car1.gearType + ", door=" + car1.door);
        System.out.println("car2의 color=" + car2.color + ", gearType=" + car2.gearType + ", door=" + car2.door);
    }
}
