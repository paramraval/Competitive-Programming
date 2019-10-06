import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeInWords {
    static String result = "", min = "", hour = "";
    static String getMin(int M){
        switch(M){
                case 30 : min = "half";
                break;
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
                case 22 : min = "twenty two minutes";
                break;
                case 21 : min = "twenty one minutes";
                break;
                case 20 : min = "twenty minutes";
                break;
                case 19 : min = "nineteen minutes";
                break;
                case 18 : min = "eighteen minutes";
                break;
                case 17 : min = "seventeen minutes";
                break;
                case 16 : min = "sixteen minutes";
                break;
                case 15 : min = "quarter";
                break;
                case 14 : min = "fourteen minutes";
                break;
                case 13 : min = "thirteen minutes";
                break;
                case 12 : min = "twelve minutes";
                break;
                case 11 : min = "eleven minutes";
                break;
                case 10 : min = "ten minutes";
                break;
                case 9 : min = "nine minutes";
                break;
                case 8 : min = "eight minutes";
                break;
                case 7 : min = "seven minutes";
                break;
                case 6 : min = "six minutes";
                break;
                case 5 : min = "five minutes";
                break;
                case 4 : min = "four minutes";
                break;
                case 3 : min = "three minutes";
                break;
                case 2 : min = "two minutes";
                break;
                case 1 : min = "one minute";
                break;
            }
            return min;
    }
    static String getHour(int H){
        switch(H){
            case 1 : hour = "one";
            break;
            case 2 : hour = "two";
            break;
            case 3 :hour  = "three";
            break;
            case 4 : hour = "four";
            break;
            case 5 : hour = "five";
            break;
            case 6 : hour = "six";
            break;
            case 7 : hour = "seven";
            break;
            case 8 : hour = "eight";
            break;
            case 9 : hour = "nine";
            break;
            case 10 : hour = "ten";
            break;
            case 11 : hour = "eleven";
            break;
            case 12 : hour = "twelve";
            break;
        }
        return hour;
    }

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        
        if(m == 0){
            result = getHour(h) + " o' clock";
        }
        if(m >= 1 && m < 30){
            result = getMin(m) + " past " + getHour(h);
        }
        if(m == 30){
            result = getMin(m) + " past " + getHour(h);
        }
        if(m > 30){
            int H = 0,M = 0;
            m = 60 - m;
            h = h + 1;
            
            result = getMin(m) + " to " + getHour(h);      
        }
    
        return result;
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
