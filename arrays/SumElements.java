package arrays;

public class SumElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9, 10};

        System.out.println(returnSum(arr));
    }

    static int returnSum(int[] arr){
        int sum=0;

        for(int i = 0; i < arr.length ; i++){
            sum = sum + arr[i];
        }

        return sum;
    }
}