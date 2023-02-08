//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

class Solution{
    void path(vector<vector<int>>& m, vector<string>& answer, string output, int i, int j, int n, vector<vector<bool>> visited) {
        if(i > n-1 || j > n-1 || (i >= n -1 && j >= n -1)) {
            cout << "op " << output;
            answer.push_back(output);
            return;
        }
        cout << "op1 " << output;
        visited[i][j] = true;
        if(i < n-1 && m[i+1][j] == 1 && visited[i+1][j] == false) {
            output.push_back('D');
            path(m, answer, output, i+1, j, n, visited);
            output.pop_back();
        }
        if(j < n-1 && m[i][j+1] == 1 && visited[i][j+1] == false) {
            output.push_back('R');
            path(m, answer, output, i, j+1, n, visited);
            output.pop_back();
        }
        if(i > 0 && i < n && m[i-1][j] == 1 && visited[i-1][j] == false) {
            output.push_back('U');
            path(m, answer, output, i-1, j, n, visited);
            output.pop_back();
        }
        if(j > 0 && j < n && m[i][j-1] == 1 && visited[i][j-1] == false) {
            output.push_back('L');
            path(m, answer, output, i, j-1, n, visited);
            output.pop_back();
        }
       //  visited[i][j] = false;
    }
    public:
    vector<string> findPath(vector<vector<int>> &m, int n) {
        // Your code goes here
        vector<vector<bool>> visited;
        for(int k = 0 ; k < n ; k++) {
            for(int l = 0 ; l < n ; l++) {
                visited[k][l] = false;
            }
        }
        vector<string> answer;
        string output;
        int i = 0, j = 0;
        cout << "op2 " << output;
        path(m, answer, output, i, j, n, visited);
        return answer;
    }
};

    


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<vector<int>> m(n, vector<int> (n,0));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cin >> m[i][j];
            }
        }
        Solution obj;
        vector<string> result = obj.findPath(m, n);
        sort(result.begin(), result.end());
        if (result.size() == 0)
            cout << -1;
        else
            for (int i = 0; i < result.size(); i++) cout << result[i] << " ";
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends