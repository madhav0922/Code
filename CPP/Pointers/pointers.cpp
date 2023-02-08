#include<iostream>
using namespace std;

void func(int **p2) {
    cout << p2 << "\n";
    p2 = p2+1;
    cout << p2 << "\n";
}
int main() {
    int i = 5;
    int* p = &i;
    int** p2 = &p;

    int *q = &i;
    cout << p << " " << q << "\n";

    cout << i << " " << p << " " << p2 << " " << **p2 << "\n";
    func(p2);
    p2 = p2+1;
    cout << i << " " << p << " " << p2 << " " << "\n";

}