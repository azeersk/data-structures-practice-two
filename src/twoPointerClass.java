import java.util.Scanner;

public class twoPointerClass {
    // two pointer method
    public static String twoPointer(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int sum = arr[start] + arr[end];
            if(sum == k){
                return start + " " + end;
            }
            else if(sum < k){
                start = start + 1;
            }
            else{
                end = end - 1;
            }
        }
        return "-1";
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {11,22,33,44,55,66,77,88,99};
        int k = input.nextInt();
        String value = twoPointer(arr,k);
        if(value == "-1"){
            System.out.println("NOT found!!");
        }
        else{
            System.out.println(value);
        }

    }
}
