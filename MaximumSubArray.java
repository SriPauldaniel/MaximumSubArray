import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(findMaxSub(arr, n, m));
        sc.close();
    }

    public static int findMaxSub(int[] arr,int n,int m) {
        int sum = 0,result = 0;
        for(int i=0;i<n;i++) {
            sum = 0;
            for(int j=0;j<n;j++) {
                if(sum+arr[j] <= m) {
                    sum += arr[i];
                }
            }
            if(result<sum) {
                result = sum;
            }
        }
        return result;
    }
}