#include<iostream>
using namespace std;

class Stack{
    public:
    int top;
    int *arr;
    int length;

    Stack(int size) {
        this -> length = size;
        this -> arr = new int[size];
        this -> top = -1;
    }

    void push(int element) {
        if(this -> top < this -> length -1) {
            this -> top++;
            this -> arr[top] = element;
        } else {
            cout << "Stack Overflow\n";
        } 
    }

    void pop() {
        if(this -> top >= 0) {
            this -> arr[top] = -1;
            top--;
            length--;
        } else {
            cout << "Stack empty\n";
        }
    }

    void peek() {
        if(top < 0) {
            cout<< "Stack Empty\n";
        } else {
            cout << this -> arr[top] <<endl;
        }
    }

    void print() {
        for(int i = 0 ; i < this -> length ; i++) {
            cout<< arr[i] << " ";
        }
        cout<<endl;
    }
};

int main() {
    Stack *st = new Stack(5);

    st -> push(10);
    st -> push(20);
    st -> push(30);
    st -> push(40);
    st -> push(50);
    st -> push(60);
    st -> push(70);

    st->peek();
    st->pop();
    st->peek(); 

    st->print();

}