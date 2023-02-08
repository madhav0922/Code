#include<bits/stdc++.h>
using namespace std;

bool isPossible(vector<int> &pages, int noOfStudents, int mid) {
    int i = 0, studentCount = 1, sum = 0;

    while(i < pages.size()) {
        sum = sum + pages[i];
        if(sum > mid) {
            studentCount++;
            sum = pages[i];
        }
        if(studentCount > noOfStudents) {
            return false;
        }
        i++;
    }
    return true;
}
int binarySearch(vector<int> &pages, int noOfStudents, int low, int high) {
    // cout << "low " << low << " high " << high << endl; // To Visualize recursive calls
    int mid = low + (high - low) / 2;
    if(low > high) {
        return mid;
    }
    // cout << "mid" << mid; // To Visualize recursive calls
    if(isPossible(pages, noOfStudents, mid)) {
        return binarySearch(pages, noOfStudents, low, mid - 1);
    } else {
        return binarySearch(pages, noOfStudents, mid + 1, high);
    }
    return mid;
}
int main() {
    vector<int> pages{10, 20, 30, 40};
    int noOfStudents = 2, total_sum = 0;
    if(noOfStudents > pages.size()) {
        return -1;
    }
    for(int i = 0 ; i < pages.size(); i++) {
        total_sum += pages[i];
    }
    int low = *max_element(pages.begin(), pages.end()), high = total_sum;
    cout << binarySearch(pages, noOfStudents, low, high);
}