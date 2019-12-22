#include<iostream>
#include<sstream>
using namespace std;

int main(){
  int T;
  cin >> T;

  while(T--){

    int n;
    cin >> n;
    ostringstream str1;
    str1 << n;
    string s = str1.str();

    int k = (int)s.size();
    int count = 0;
    for(int i = 0; i < k; i++){
      if(s[i] == '4')
        count++;
    }
    cout << count << endl;
  }
  
  return 0;
}
