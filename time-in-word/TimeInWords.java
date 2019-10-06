import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeInWords {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
    	String min = "";
    	if(m == 0){
    		min = "o'clock";
    		System.out.println()
    	}
    	if(m > 30){
    		int M = 60 - m;
    		
    		if(M == 15){
    			min = "quater"
    		}
    		switch(M){
    			case 29 : min = "twenty nine minutes";
    			break;
       			case 28 : min = "twenty eight minutes";
    			break;
    			case 27 : min = "twenty seven minutes";
    			break;
    			case 26 : min = "twenty six minutes";
    			break;
    			case 25 : min = "twenty five minutes";
    			break;
    			case 24 : min = "twenty four minutes";
    			break;
    			case 23 : min = "twenty three minutes";
    			break;
    			case 22 : min = "twenty nine minutes";
    			break;
    			case 21 : min = "twenty nine minutes";
    			break;
    			case 20 : min = "Twenty minutes";
    			break;
    			case 19 : min = "Nineteen minutes";
    			break;
    			case 18 : min = "Eighteen minutes";
    			break;
    			case 17 : min = "Seventeen minutes";
    			break;
    			case 16 : min = "Sixteen minutes";
    			break;
//    			case 15 : min = "twenty nine minutes";
  //  			break;
    			case 14 : min = "Fourteen minutes";
    			break;
    			case 13 : min = "Thirteen three minutes";
    			break;
    			case 12 : min = "Twelve minutes";
    			break;
    			case 11 : min = "Eleven minutes";
    			break;
    			case 10 : min = "Ten minutes";
    			break;
    			case 9 : min = "Nine minutes";
    			break;
    			case 8 : min = "Eight minutes";
    			break;
    			case 7 : min = "Seven minutes";
    			break;
    			case 6 : min = "Six minutes";
    			break;
    			case 5 : min = "Five minutes";
    			break;
    			case 4 : min = "Four minutes";
    			break;
    			case 3 : min = "Three minutes";
    			break;
    			case 2 : min = "Two minutes";
    			break;
    			case 1 : min = "One minutes";
    			break;
    		}
    		System.out.println(min +" to " + (h+1));
    	}


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
