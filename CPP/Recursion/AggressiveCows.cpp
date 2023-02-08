#include<bits/stdc++.h>
using namespace std;

int isPossible(vector<int> stalls, int noOfCows, int mid) {
    int sum = 0, i = 0, cowsCount = 1, lastPos = stalls[0];
    while(i < stalls.size()) {
        if (stalls[i] - lastPos >= mid) {
            cowsCount++;
            lastPos = stalls[i];
            if(cowsCount == noOfCows) {
                return true;
            }
        }
        i++;
    }
    return false;
}
int binarySearch(vector<int> stalls, int noOfCows, int low, int high, int answer) {
    // cout << "low " << low << " high " << high << endl; // To Visualize recursive calls
    int mid = low + (high - low) / 2;
    if(low > high) { 
        return answer;
    }
    // cout << "mid" << mid; // To Visualize recursive calls
    // cout << "answer" << answer;
    if(isPossible(stalls, noOfCows, mid)) {
        answer = mid;
        return binarySearch(stalls, noOfCows, mid + 1, high, answer);
    } else {
        return binarySearch(stalls, noOfCows, low, mid - 1, answer);
    }
    // maintain answer to get answer
}
int main() {
    vector<int> stalls = {4, 2, 1, 3, 6};
    int noOfCows = 2;
    if(stalls.size() < noOfCows) {
        return -1;
    }
    sort(stalls.begin(), stalls.end());
    int low = 0, // low 0 due to this test case
    // 7 4
    // 87 93 51 81 68 99 59 
    // answer is 13 for this
        high = stalls[stalls.size() - 1];
    return binarySearch(stalls, noOfCows, low, high, -1);
}