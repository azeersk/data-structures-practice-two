import java.util.Scanner;

public class binaryClass {
    //binary search algorithm
    public static int binary_search(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {12,23,34,45,56,67,78,89,90};
        int k = input.nextInt();
        int value = binary_search(arr,k);
        if(value == -1){
            System.out.println(k+" element is not found!!");
        }
        else{
            System.out.println("index of the "+k+" in given array is: "+value);
        }
    }
}
