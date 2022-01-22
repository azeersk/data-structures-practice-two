import java.util.Scanner;

public class prefixClass {
    public static int prefixSum(int[] arr, int s, int e){
        int start = 0, end = arr.length;
        int[] sumArray = new int[end];
        sumArray[0] = arr[0];
        try {
            for (int i = 1; i < end; i++) {
                sumArray[i] = sumArray[i - 1] + arr[i];
            }
            if (s > 0) {
                int sum = sumArray[e] - sumArray[s - 1];
                return sum;
            } else {
                return sumArray[e];
            }
        }catch (Exception ex){
            System.out.println("error is: "+ex.getMessage());
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] array = {12,23,60,60,78,45,59,80};

        for(int i=0; i<3; i++){
            int s = input.nextInt();
            int e = input.nextInt();
            int value = prefixSum(array,s,e);
            System.out.println(value);
        }
    }
}
