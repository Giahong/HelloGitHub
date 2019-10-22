package Sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] A, int n) {
        // i用于确定冒泡排序时要扫描的范围
        for (int i = n-1; i > 0; i--){
            // j从前往后，每一轮中进行比较
            for (int j = 0; j < i;j++){
                if (A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        return A;
    }

    public static int[] bubbleSort1(int[] A, int n) {

        for (int i = n-1;i > 0; i--){
            for (int j = 0;j < i;j++) {
                if (A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        return A;

    }

    public static void main(String[] args) {
        int[] Array = {1,5,3,8,7,2};
        int[] arr = bubbleSort1(Array,6);
//        for(int a : arr){
//            System.out.print(a);
//        }
//        throw new RuntimeException("222");
        System.out.println(Arrays.toString(arr));
    }

}
