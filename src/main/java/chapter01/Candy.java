package chapter01;

/**
 * 分配问题
 */

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        System.out.println(new Candy().method(new int[]{1, 1, 1}));
    }

    public static int method(int[] kids) {
        int[] candies = new int[kids.length];
        for (int i = 0; i < kids.length; i++) {
            candies[i] = 1;
        }

        //从左往右
        for (int i = 0; i < kids.length - 1; i++) {
            if (kids[i] < kids[i + 1]) candies[i + 1] += 1;
        }

        //从右往左
        for (int i = kids.length - 1; i > 0; i--) {
            if (kids[i - 1] > kids[i] && candies[i - 1] <= candies[i]) candies[i - 1] += 1;
        }

        return Arrays.stream(candies).sum();
    }
}
