package cn.codepzj;

public class HelloWorld {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = (int) Math.pow(2, 31) - 1;
        long d = (long) Math.pow(2, 63) - 1;
        float e = 2F;
        double f = 10.5;
        char g = 'a';
        boolean h = true;

        System.out.printf(
                "a=%d, b=%d, c=%d, d=%d, e=%f, f=%f, g=%c, h=%b%n",
                a, b, c, d, e, f, g, h);
    }
}
