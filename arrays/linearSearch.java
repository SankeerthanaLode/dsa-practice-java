package arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 50;

        System.out.println(returnIndex(arr, key));

    }

    static int returnIndex(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
