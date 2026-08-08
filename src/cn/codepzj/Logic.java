package cn.codepzj;

public class Logic {
    static boolean between1And10(int num) {
        return num > 1 && num < 10;
    }

    public static void main(String[] args) {
        int a = 5;
        if (between1And10(a)) {
            System.out.println("a > 1 && a < 10");
        }

        int b = 10;

        switch (b) {
            case 10:
                System.out.println("b is 10");
                break;
            case 20:
                System.out.println("b is 20");
                break;
            default:
                break;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int num2 = 1;
        while (num2 < 10) {
            System.out.println(num2++);
        }

        num2 = 1;
        do {
            System.out.println(num2++);
        } while (num2 < 10);
    }
}
