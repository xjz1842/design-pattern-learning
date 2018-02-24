package Tamplate;

public class ConcreteSort extends AbstractSort {

    @Override
    protected void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            selectSort(array, i);
        }
    }

    private void selectSort(int[] arr, int index) {
        int minValue = 32767;
        int indexMin = 0; //最小值索引变量
        int temp; //暂存变量

        for (int i = index; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                indexMin = i;
            }
        }
        temp = arr[index];  //交换两个变量
        arr[index] = arr[indexMin];
        arr[indexMin] = temp;
    }

}
