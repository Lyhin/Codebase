import java.util.Arrays;

/**
 * 定义一个方法，返回一个长度为10的整数数组，对数组的元素进行随机的初始化100内的正整数，
 * 要求数组中的元素不重复
 */

public class RandomArray {
    public static void main(String[] args) {
        int [] mydata=getArray();
        System.out.println(Arrays.toString(mydata));
    }


    public static int[] getArray(){
        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            int xx = (int) (Math.random() * 100 + 1);
            //判断xx是否在数组中，如果xx已在数组中，需要重新生成
            while (exist(data,xx)) {
                xx = (int) (Math.random() * 100 + 1);
            }
            data[i]=xx;
        }
        return data;
    }


    //判断key元素是否在myarray数组中，如果存在返回true
    public static boolean exist(int[] myarray, int key) {
        for (int i = 0; i < myarray.length; i++) {
            if (key == myarray[i]) {
                return true;
            }
        }
        return false;
    }
}