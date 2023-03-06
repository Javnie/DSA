package chapter01;

/**
 * 分配问题
 */

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] kids = new int[]{1, 2};
        int[] cookies = new int[]{1, 2, 3};

        System.out.println(new AssignCookies().method1(kids, cookies));
        System.out.println(new AssignCookies().method2(kids, cookies));

    }

    int method1(int[] kids, int[] cookies) {
        Arrays.sort(kids);
        Arrays.sort(cookies);

        int result = 0;
        int j = 0;
        for (int kid : kids) {
            for (int i = j; i < cookies.length; i++) {
                if (cookies[i] >= kid) {
                    result++;
                    break;
                }
            }
            j++;
        }
        return result;
    }

    int method2(int[] kids, int[] cookies) {
        Arrays.sort(kids);
        Arrays.sort(cookies);

        int kid = 0, cookie = 0;
        while (kid < kids.length && cookie < cookies.length) {
            if (cookie >= kid) kid++;
            else cookie++;
        }
        return kid;
    }
}
