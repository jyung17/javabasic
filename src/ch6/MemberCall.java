package ch6;

public class MemberCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    /**
     * Non-static field 'iv' cannot be referenced from a static context
     * 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
     */
 // static int cv2 = iv;
    static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용가능.

    static void staticMethod1() {
        System.out.println(cv);
     // System.out.println(iv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
     // instanceMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
