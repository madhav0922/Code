#include<iostream>

using namespace std;
bool binarySearch(int arr[], int low, int high, int target) {
    int mid = low+ (high - low) / 2;
    if(low > high) {
        return false;
    }
    if(arr[mid] == target) {
        return true;
    } else if(target < arr[mid]) {
        return binarySearch(arr, low, mid - 1, target);
    } else {
        return binarySearch(arr, mid+1, high, target);
    }
   // return false;
 }
int main() {
    int arr[] = {1,2,3,4,5,6,7,8,9};
    int low = 0, high = 8, target = 10;
    bool ans =  binarySearch(arr, low, high, target);
    cout << ans << endl;
}