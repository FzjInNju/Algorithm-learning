/*
空间复杂度：O（1）
时间复杂度：O（n^2)
 */
public class SelectionSort {
    public int[] selectionSort(int[] arr){
        if ( arr == null || arr.length < 2){
            return arr;
        }
        for ( int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                swap(arr,i,minIndex);
            }
        }
        return arr;
    }

    public void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
