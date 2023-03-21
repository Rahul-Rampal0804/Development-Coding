#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    int k=0;
	    int arr[n];
	    for(int i=0;i<n;i++){
	        cin>>arr[i];
	       
	    }
	    if(arr[0]!=arr[1]){
	        k++;
	    }
	    if(arr[n-1]!=arr[n-2]){
	        k++;
	    }
	    for(int i=1;i<n-1;i++){
	     if( ((arr[i-1] !=arr[i]) && arr[i] ==arr[i+1]) || ((arr[i-1] ==arr[i]) && arr[i] !=arr[i+1]) || ((arr[i-1] !=arr[i]) && arr[i] !=arr[i+1])){
	         
	         k++;
	         
	     }
	       
	    }
	    cout<<k<<endl;
	    
	}
	return 0;
}
