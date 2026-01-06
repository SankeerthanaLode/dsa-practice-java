package arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 44, 55};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                
            }else{
                return false;
            }
        }

        return true;
    }
}
