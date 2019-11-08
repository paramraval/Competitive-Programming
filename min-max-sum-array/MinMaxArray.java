import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class MinMaxArray {

 // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr){
        double min = 0,max = 0,sum = 0;
        
 /*       for(int i = 1; i < arr.length; i++){
                for(int j = i; j > 0; j--){
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }          */
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; 
        }
        
        min = sum - arr[arr.length-1];
        max = sum - arr[0];

        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(0);
        
        
        System.out.println(df.format(min) +" "+ df.format(max));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
