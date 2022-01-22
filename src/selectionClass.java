import java.util.Arrays;

public class selectionClass {
    public static void selectionSort(int[] arr){
        int arLan = arr.length;
        for(int i=0; i<arLan; i++){
            int min = i;
            for(int j=i+1; j< arLan; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int smaller = arr[min];
            arr[min] = arr[i];
            arr[i] = smaller;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {9,8,12,4,7,23};
        selectionSort(arr);
    }
}
