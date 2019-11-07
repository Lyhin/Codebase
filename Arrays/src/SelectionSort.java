import java.util.Arrays;

/**
 * 选择排序（由小到大）
 * 从一数组中选择最小的交换到前面，再在剩余的元素中选择最小的交换到前面
 * 与冒泡排序相比，交换的次数减少了
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] date = {56, 34, 89, 2, 78, 40};
        System.out.println(Arrays.toString(date));
        System.out.println("-------------------");

        for (int x = 0; x < date.length - 1; x++) {
            //找数组中最小的元素，交换到0位置
            int min = x;          //保存最小元素的下标
            for (int i = min + 1; i < date.length; i++) {
                if (date[i] < date[min]) {
                    min = i;
                }
            }
            //把min元素交换到0位置
            if (min != x) {
                int t = date[x];
                date[x] = date[min];
                date[min] = t;
            }
            System.out.println(Arrays.toString(date));
            System.out.println("-------------------");
        }
        System.out.println(Arrays.toString(date));

    }
}
