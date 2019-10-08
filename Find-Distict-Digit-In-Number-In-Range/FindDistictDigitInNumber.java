import java.util.Scanner;
import java.util.*;

class FindDistictDigitInNumber{
	static int[] arr = new arr[100];
	static int findDistictDigitInNumber(int start, int end){
		int ans = -1;
		int number = 0;
		
		int count = 0;
		int check = 0;

		for(int i = start+1; i < end; i++){
			
			number = i;

			while(number != 0){
				int n = number % 10;
				arr[count] = n;
				count++;
				number = number / 10;			
			}

			for(int j = 0; j < count; j++){
				for(int k = 1; k < count; k++){
					if(arr[j] == arr[k]){
						check++;
					}
				}
			}

			if(check == 0)
				return number;		
		}
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int start = s.nextInt();
		int end = s.nextInt();

		System.out.println(findDistictDigitInNumber(start,end));

		s.close();
	}
}