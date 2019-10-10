#include<iostream>
using namespace std;

	int FindDistictDigitInNumber(int start, int end){
		int answer = -1;
		int number = 0;
		
		int count = 0;
		int check = 0;
		int arr[100];
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
					if(arr[j] != arr[k]){
						answer = i;
					}
				}
			}

				
		}
		return answer;		
	}

int main(){
	
	int start,end,answer;
	
	cin >> start >> end;
	answer = FindDistictDigitInNumber(start, end);
	cout << answer;
	return 0;
}
