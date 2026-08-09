package cn.codepzj;

public class ArrUtil {
    private ArrUtil() {
    }

    public static void printArr(int[] arr) {
        if (arr == null) {
            System.out.print("arr is null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
