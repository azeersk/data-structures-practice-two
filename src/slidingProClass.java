import java.util.Scanner;

public class slidingProClass {
    // sliding window variant problem
    public static String sliding_window_problem(int[] arr, int k){
        int start = 0;
        int end = 1;
        int n = arr.length;
        int currentSum = 0;
        while(end<n){
            while (currentSum > k && start < (end - 1)){
                currentSum = currentSum - arr[start];
                System.out.println(currentSum);
                start = start + 1;
            }

            if(currentSum == k){
                return (start+" "+ end);
            }

            if(end < n){
                currentSum = currentSum + arr[end];
                System.out.println(currentSum);
            }
            end = end + 1;
        }
        return "-1";
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] arr = {12,23,60,60,78,45,59,80};
        String result = sliding_window_problem(arr, k);
        System.out.println(result);
    }
}
