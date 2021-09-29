public class BuboSort {
    Util util = new Util();
    public int[] buboSort(int[] arr){
        if ( arr == null || arr.length < 2) return arr;
        for (int i = arr.length -1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    util.swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }


}
