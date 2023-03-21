#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	int n;
	cin>>n;
	int count=0;
	int hash[n]={0};
	int a[n];
	for(int i=0;i<n;i++){
	    cin>> a[i];
	    
	}
	    for(int i=0;i<n-1;i++){
	        if(a[i]==a[i+1]){
	            hash[i]++;
	          //  hash[i+1]++;
	            
	        }
	        
	        
	    }
	  /*  if(a[n-2]==a[n-1]){
	        
	        hash[n-1]++;
	    }*/
	    
	    for(int j=0;j<n;j++){
	        if(hash[j]==0){
	            count++;
	        }
	    }
	    cout<<count<<endl;
	    
	}
	return 0;
}
