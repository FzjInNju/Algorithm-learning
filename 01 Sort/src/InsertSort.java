import com.sun.xml.internal.ws.api.model.wsdl.WSDLFault;

public class InsertSort {
    Util util = new Util();

    public int[] insertSort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int i = 1; i < arr.length ; i++){
            for ( int j = i-1; j >= 0 && arr[j+1] < arr[j]; j--){
                util.swap(arr,j+1,j);
            }
        }
        return arr;
    }
}
