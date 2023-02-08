#include<iostream>

using namespace std;
bool isPossible(int pages[], int mid, int noOfStudents) {
    int i = 0, sum = 0, studentCount = 1;

    while(i < 4) {
        sum = sum + pages[i];
        if(sum > mid) {
            studentCount++;
            sum = 0;
            i--;
        }
        if(studentCount > noOfStudents) {
            return false;
        }
        i++;
    }
    return true;
}
int main() {
    int pages[] = {10, 20, 30, 40} , noOfStudents = 2, total_sum = 0;
    for(int i = 0 ; i < 4; i++) {
        total_sum += pages[i];
    }
    int low = 0, high = total_sum, mid = 0;
    while(low < high) {
        mid = low + (high - low) / 2;
        if(isPossible(pages, mid, noOfStudents)) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    cout << mid;
}