#include<bits/stdc++.h>
using namespace std;

int power(int a, int b) {
    if(b == 1) {
        return a;
    }
    int answer = power(a, b/2); // Not it is efficient
    if(b % 2 == 0) {
        return answer * answer;
    } else {
        return a * answer * answer;
    }
}
int main() {
    int a = 3, b = 2;
    cout << power(a, b);
}