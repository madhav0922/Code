#include<bits/stdc++.h>
using namespace std;

void merge(int *a, int low, int high, int* nbInversions) {
    int mid = low + (high - low) / 2;
    int i = low, j = mid+1;
    // for(int i = low ; i <= high; i++) {
    //     cout<< a[i] << " ";
    // }
    // cout << endl;
    while(i <= mid && j <= high) {
        if(a[i] >= a[j]) {
            
            *nbInversions += mid - i + 1; // nb inversions
            // cout << a[i] << " inv2 " << *nbInversions << endl;
        
            int temp = a[j];
            for(int k = j; k > i; k--) {
                a[k] = a[k-1];
            }
            a[i] = temp;
            i++;
            mid++; // In order to sort properly
            j++;
        } else {
            i++;
        }
    }
}

void mergeSort(int *a, int low, int high, int* nbInversions) {
    int mid = low + (high - low) / 2;
    if(low < high) {
        mergeSort(a, low, mid, nbInversions);
        mergeSort(a, mid+1, high, nbInversions);
    }
    merge(a, low, high, nbInversions);
}

int main() {
    int a[] = {8,4,2,1}, n= 3;
    int *nbInversions;
    *nbInversions = 0;
    mergeSort(a, 0, n, nbInversions);
    cout << *nbInversions << endl;
    for(int i = 0 ; i <= n; i++) {
        cout<< a[i];
    }
}