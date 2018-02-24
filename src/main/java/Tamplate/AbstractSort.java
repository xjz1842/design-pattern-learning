package Tamplate;

import java.util.Arrays;

public abstract class AbstractSort {

    /**
     * 将数组array由小到大排序
     * @param array
     */
    protected abstract void sort(int[] array);

    public void showSortResult(int[] array){
        this.sort(array);
        System.out.print("排序结果：");

        Arrays.stream(array).forEach(k->{
            System.out.printf("%3s", k);
        });
    }
}
