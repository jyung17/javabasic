package ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score=" + score);
        System.out.println("d="+d);

        System.out.println("int -> char : "+ (char) 65);
        System.out.println("char -> int : " + (int) 'A');
        System.out.println("float -> int : " + (int) 1.6f);
        System.out.println("int -> float : " + (float) 10);
    }
}
