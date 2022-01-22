import java.util.Arrays;
import java.util.Scanner;

public class slidingClass {
    //sliding window method.
    public static int sliding_window(int[] arr,int k){
        if(k>arr.length){
            return -1;
        }
        int currentSum = 0;
        int result = 0;
        for(int i=0; i<k; i++) {
            currentSum = currentSum + arr[i];
        }
        for(int i=0; i<(arr.length-k); i++){
            currentSum = currentSum- arr[i] + arr[k+i];
            if (currentSum > result) {
                result = currentSum;
            }
        }
       return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] arr = {12,23,60,60,78,45,59,80};
        int value = sliding_window(arr,k);

        if(value == -1){
            System.out.println("invalid array for sliding window!!");
        }
        else{
            System.out.println("Greatest sum is: "+ value);
        }
    }
}
