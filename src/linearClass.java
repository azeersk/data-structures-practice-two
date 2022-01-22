import java.util.Scanner;

public class linearClass {
    // linear search algorithm.
    public static int linear_search(int[] arr, int k){
        int start = 0;
        while (start<arr.length){
            if(arr[start] == k)
                return start;
            else
                start++;
        }
        return -1;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {12,2,34,4,9,20,1,5,10};
        int k = input.nextInt();
        int value = linear_search(arr,k);
        if(value == -1){
            System.out.println(k+" element is not found!!");
        }
        else{
            System.out.println("index of the "+k+" in given array is: "+value);
        }
    }
}
