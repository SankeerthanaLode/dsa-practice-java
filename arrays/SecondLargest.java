package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {11, 11, 11};

        System.out.println(returnSecondMax(arr));
    }

    static int returnSecondMax(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        if(second_largest == largest || second_largest == Integer.MIN_VALUE){
            return -1;
        }else{
            return second_largest;
        }
        
    }
}
