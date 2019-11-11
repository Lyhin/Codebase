import java.util.Arrays;

/**
 * 冒泡排序(由小到大)
 * 从前往后进行两两比较，如果前面的数大就进行交换，把大的数交换到后面
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {21, 34, 65, 8, 90, 12};
        System.out.println(Arrays.toString(data));
        System.out.println("------------------");

        for (int x = 0; x < data.length-1; x++) {

            for (int i = 0; i < data.length - 1-x; i++) {
                if (data[i] < data[i + 1]) {
                    int t = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = t;
                }
                System.out.println(Arrays.toString(data));
            }
            System.out.println("------------------");
        }
        System.out.println(Arrays.toString(data));
    }
}
