// C++ program to find Majority 
// element in an array
#include <bits/stdc++.h>
using namespace std;

// Function to find Majority element
// in an array
// it returns -1 if there is no majority element

int majorityElement(int *arr, int n)
{
	if (n == 1) return arr[0];
	
	int cnt = 1;
	// sort the array, o(nlogn)
	sort(arr, arr + n);
	for (int i = 1; i <= n; i++){
		if (arr[i - 1] == arr[i]){
			cnt++;
		}
		else{
			if (cnt > n / 2){
				return arr[i - 1];
			}
			cnt = 1;
		}
	}
	// if no majority element, return -1
	return -1;
}


// Driver code
int main()
{
	int arr[] = {1, 1, 2, 1, 3, 5, 1};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	// Function calling 
	cout<<majorityElement(arr, n);

	return 0;
}
