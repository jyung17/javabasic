package ch6;

class ConstructorData1 {
    int value;
}

class ConstructorData2 {
    int value;

    ConstructorData2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        ConstructorData1 d1 = new ConstructorData1();
        ConstructorData2 d2 = new ConstructorData2(10);
    }
}
