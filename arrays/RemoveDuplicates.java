package arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8};
        int i=0;
        
        for(int j=i+1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

         for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
