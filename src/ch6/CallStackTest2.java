package ch6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음");
        firstMethod2();
        System.out.println("main(String[] args)이 끝났음.");
    }

    static void firstMethod2() {
        System.out.println("firstMethod2()이 시작되었음");
        secondMethod2();
        System.out.println("firstMethod2()이 끝났음.");
    }

    static void secondMethod2() {
        System.out.println("secondMethod2()이 시작되었음");
        System.out.println("secondMethod2()이 끝났음.");
    }
}
