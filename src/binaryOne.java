import java.util.Scanner;

public class binaryOne {
    // binary search using recursion.
    public static int binary_Search_Recursion(int[] arr, int start, int end, int k){
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if (arr[mid] < k){
                return binary_Search_Recursion(arr,mid+1, end, k);
            }
            else{
                return binary_Search_Recursion(arr, start, mid-1, k);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {12,23,34,45,56,67,78,89,90};
        int start = 0;
        int end = arr.length-1;
        int k = input.nextInt();
        int value = binary_Search_Recursion(arr, start, end, k);

        if (value == -1){
            System.out.println(k+" element is not found!!");
        }
        else{
            System.out.println("index of the "+k+" in given array is: "+value);
        }
    }
}
