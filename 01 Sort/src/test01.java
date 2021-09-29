public class test01 {

    public static void print(int[] arr){
        int len = arr.length;
        for ( int i = 0; i < len; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int testArr[] = {4,3,2,1};
        InsertSort sort = new InsertSort();

        print(sort.insertSort(testArr));
    }
}
