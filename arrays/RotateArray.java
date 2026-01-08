package arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        
        k = k%arr.length;
        returnRotatedArray(arr,k);

    }

    static int[] returnRotatedArray(int[] arr, int k){

        if(k==0 || k==arr.length){
            return arr;
        }else{
            reverse(0,arr.length-1);
            reverse(0,arr.length-k)
        }
    }
}
