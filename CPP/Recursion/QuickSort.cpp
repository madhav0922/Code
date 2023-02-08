#include <iostream>
#include<vector>
using namespace std;

int partition(vector<int> arr, int low, int high) {
    int i = low+1, j = 0, count = 0;
    int pivot = arr[low];
    while(i < arr.size()) {
        if(arr[i] < pivot) {
            count++;
        }
        i++;
    }
    i = low;
    j = high;
    cout<< "count " << count;
    int pivotIndex = low + count;
    swap(arr[pivotIndex], arr[high]);
    while(i <= pivotIndex && j >= pivotIndex) {
        while(arr[i] < pivot) {
            i++;
        }
        while(arr[j] > pivot) {
            j--;
        }
        if(arr[i] > pivot && pivot > arr[j]) {
            swap(arr[i], arr[j]);
            i++;
            j--;
        }
    }
    return pivotIndex;
} 

void sortQuick(vector<int> arr, int low, int high) {
    if(low >= high) {
        return;
    }
    int pos = partition(arr, low, high);
    
    sortQuick(arr, low, pos-1);
    sortQuick(arr, pos+1, high);
    
}

vector<int> quickSort(vector<int> arr)
{
    int low = 0, high = arr.size() -1;
    sortQuick(arr, low, high);
    return arr;
}

int main() {
    vector<int> arr = {4,2,1,5,3};
    vector<int> arr2 = quickSort(arr);
    
    for(int i = 0 ; i < arr2.size(); i++) {
        cout << arr2[i];
    }
    
}