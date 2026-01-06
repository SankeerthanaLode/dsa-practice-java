package arrays;

public class CountEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 74, 8932, 783, 5, 9, 8, 6, 32};
        System.out.println(returnEvenCount(arr));
    }

    static int returnEvenCount(int[] arr){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
