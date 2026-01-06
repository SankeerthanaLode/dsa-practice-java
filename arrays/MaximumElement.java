package arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 78, 876, 768, 2};
        System.out.println(returnMaxElement(arr));
    }

    static int returnMaxElement(int[] arr){

        int max = arr[0];

        for(int i=1; i<arr.length; i++){

            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
