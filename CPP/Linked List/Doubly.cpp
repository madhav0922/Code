#include<bits/stdc++.h>
using namespace std;

class Node {
    public:
    Node* next = NULL;
    Node* prev = NULL;
    int value;

    Node(int value) {
        this -> value = value;
    }
};

void print(Node* head) {
    while(head != NULL) {
        cout<< head -> value << " ";
        head = head -> next;
    }
    cout<< endl;
}

void printTail(Node *tail) {
    while(tail != NULL) {
        cout << tail -> value << " ";
        tail = tail -> prev;
    }
    cout << endl;
}

void insertionAtBeg(Node* &head, int value) {
    Node* newNode = new Node(value);
    if(head == NULL) {
        head = newNode;
    }
    newNode -> next = head;
    head -> prev = newNode;
    head = newNode;
}

void insertionAtEnd(Node* &head, int value) {
    Node *p = head;
    Node * newNode = new Node(value);
    if(head == NULL) {
        p = newNode;
        return;
    }
    while(p -> next != NULL) {
        p = p -> next;
    }
    p -> next = newNode;
}

void insertionFull(Node** head, int value, int pos = 1) {
    Node* newNode = new Node(value);
    Node* p = *head;
    cout<< p;
    if(!*head) {
        *head = new Node(value);
        
    }
    else if(pos == 1) {
        newNode -> next = p;
        p = newNode;
        return;
    }
    else if(pos > 1) {
        int i = 1;
        while(i < pos - 1 && p -> next != NULL) {
            p = p -> next;
            i++;
        }
        newNode -> next = p -> next;
        p -> next = newNode;
    }
}

int main() {
    Node* a = new Node(10);
    Node* b = new Node(20);
    Node* c = new Node(30);
    a -> next = b;
    b -> next = c;
    b -> prev = a;
    c -> prev = b;
    // print(a);
    // insertionAtBeg(a, 5);
    // print(a);
    // insertionAtEnd(a, 50);
    // print(a);

    Node* d = NULL;

    insertionFull(&d, 100, 1);
    print(d);

    insertionAtBeg(a, 5);
    printTail(c);

}