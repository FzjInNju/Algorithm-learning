public class test {
    public static int Solution(int[] a){
        int ero = 0;
        for ( int i = 0; i < a.length;i++){
            ero = ero ^ a[i];
        }
        return ero;
    }

    public static int[] Solution2(int[] arr){
        int a_b = Solution(arr); // a_b 是 a^b

        //求a_b最右边的1, 形如00000100
        int rightOne = a_b & ( ~a_b + 1);

        //对 arr中每个rightOne所在位数是1的数 进行逐个累积抑或（相当于Solution，因为“arr中每个rightOne所在位数是1的数”构成“由多个出现偶数次的数加
        //一个出现奇数次的数（a）所组成的数组“
        int ero = 0;
        for ( int e: arr){
            if ( (e & rightOne) != 0){
                ero ^= e;
            }
        }
        int result[] = {ero,(ero ^ a_b)};
        return result;

    }

    public static void main(String[] args){
        int[] testArray = {1,1,2,2,2,2,3};
        System.out.println(Solution(testArray));
        int[] testArray2 = {1,1,2,2,2,2,3,4};
        System.out.println(Solution2(testArray2)[0] + " " + Solution2(testArray2)[1]);
    }
}
