package cn.codepzj;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 1, 2, 3 };
        int[] uniqueArr = unique(arr);
        System.out.println(uniqueArr);
    }

    static int[] unique(int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();
        int[] uniqueArr = new int[arr.length];

        int idx = 0;
        for (int val : arr) {
            System.out.println(val + " " + map.get(val));
            if (map.get(val) == null) {
                map.put(val, true);
                uniqueArr[idx] = val;
                idx++;
            }
        }
        return uniqueArr;
    }

    int a = 0;

    public static int OverrideFunc() {
        return 0;
    }

    public static int OverrideFunc(int n) {
        return 0;
    }

    public static int OverrideFunc(String s) {
        return 0;
    }
}
