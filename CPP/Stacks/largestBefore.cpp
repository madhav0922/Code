#include<vector>
#include<stack>
#include<iostream>

using namespace std;

vector<int> nextSmallerElement(vector<int> &vector, int n)
{
    // Write your code here.
    stack<int> stack;
    vector<int> ans;
    stack.push(-1);
    
    for(int i = n-1 ; i >= 0 ; i--) {
        int curr = vector[i];
        while(stack.top() >= curr) {
            stack.pop();
        }
        ans[i] = stack.top();
        stack.push(curr);
    }
    return ans;
}

int main() {
    vector<int> vector;
    vector.push_back(2);
    vector.push_back(1);
    vector.push_back(4);
    vector.push_back(3);

    vector<int> ans = nextSmallerElement(vector, arr.size());

    for(int i = 0 ; i < ans.size() ; i++) {
        cout<< ans[i] <<" ";
    }
    cout<<endl;
}
