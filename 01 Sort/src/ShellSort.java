public class ShellSort {
    Util util = new Util();
    public int[] ShellSort(int[] arr){
        int gap = (int) Math.floor(arr.length / 2);
        while ( gap >= 1){
            for ( int begin = 0 ; begin < gap; begin++){
                while(arr[begin+gap] < arr[begin]){
                    util.swap(arr,begin,begin+gap);
                }
            }
            gap = (int) Math.floor(gap / 2);
        }

        return arr;
    }
}
