public class BubbleSort {
    public static void mian(String[] args) {
        int[] date = {21, 34, 65, 8, 90, 12};
        for (int i = 0; i < date.length; i++) {
            for(int x =0; x<date.length-1; x++){
                if(date[x+1]>date[x]){
                    int t = date[x];
                    date[x]=date[x+1];
                    date[x+1]=t;
                }
            }
        }

    }
}
