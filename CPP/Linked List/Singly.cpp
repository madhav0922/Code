#include<iostream>
using namespace std;

class Node {
    public:
    Node* next;
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

void insertionAtBeg(Node* &head, int value) {
    Node* newNode = new Node(value);
    if(head == NULL) {
        head = newNode;
    }
    newNode -> next = head;
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

void insertionFull(Node* &head, int value, int pos = 1) {
    Node* newNode = new Node(value);
    Node* p = head;
    if(!p) {
        head = newNode;
        return;
    }
    else if(pos == 1) {
            newNode -> next = p;
            p = newNode;
        }
    else {
        int i = 1;
        while(i < pos - 1 && p -> next != NULL) {
            p = p -> next;
            i++;
        }
        newNode -> next = p -> next;
        p -> next = newNode;
    }
}

void reverse(Node* &head) {
    Node *prev = NULL, *curr = head, *nxt = NULL;

    while(curr != NULL) {
        nxt = curr -> next;
        curr -> next = prev;
        prev = curr;
        curr = nxt;
    }
    head = prev;
}

void recReverse(Node* &head, Node* prev, Node* curr) {
    if(curr == NULL) {
        head = prev;
        return;
    }
    recReverse(head, curr, curr -> next);
    curr -> next = prev;
}

Node* recReverse(Node* &head) {
    if(head == NULL || head -> next == NULL) {
        return head;
    }
    Node *smallHead = recReverse(head -> next);
    head -> next -> next = head;
    head -> next = NULL;

    return smallHead;
}

int main() {
    Node* a = NULL;
    insertionFull(a, 10, 1);
    insertionFull(a, 20, 2);
    insertionFull(a, 30, 3);
    insertionFull(a, 40, 4);
    print(a);
    // print(a);
    // insertionAtBeg(a, 5);
    // print(a);
    // insertionAtEnd(a, 50);
    // print(a);

    Node* d = NULL; // if not set then segmentation fault! 
        // Why? because its a declaration and not definition, memory wont be allocated

    // insertionFull(&d, 100, 1);
    print(d);

    reverse(a);
    print(a);

    Node *prev = NULL, *curr = a;
    recReverse(a, prev, curr);
    print(a);

    a= recReverse(a);
    print(a);

}