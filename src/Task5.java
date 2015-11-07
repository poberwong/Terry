import java.util.Scanner;

/**
 * Created by Bob on 15/11/7.
 */

public class Task5 {
    static int i, k, re;//i 为当前游标在source数据源中的位置;k为当前input数据中的位置;re为运算结果
    private static int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private static char[] inputChars;

    public static void descMove() {//-操作的移动规则
        i = 0;
    }

    public static void addMove() {//+操作的移动规则
        if (i == source.length - 1) {
            i = 0;
        } else i++;
    }

    public static void reset() {
        re = 0;
        i = 0;
        k = 0;
    }

    /**
     * 暂时先处理掉所有的空格，因为java里，会将空格和回车作为输入结束的标识
     *
     * @param str
     */
    public static void filter(String str) {
        str.replace(" ", "");
    }

    public static void operate(String input) {
        filter(input);
        inputChars = input.toCharArray();
        for (; k < inputChars.length; k++) {
            if (inputChars[k] == '-') {
                System.out.printf("-%d", source[i]);
                re -= source[i];
                descMove();
            } else if (inputChars[k] == '+') {
                System.out.printf("+%d", source[i]);
                re += source[i];
                addMove();
            } else {
                System.out.println("\nERROR_INPUT");
                return;
            }
        }
        System.out.println("= " +re);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = null;
        while ((str = input.next()) != null) {
            reset();//再次输入时，将三个参数初始化为0；
            operate(str);
        }
    }
}
