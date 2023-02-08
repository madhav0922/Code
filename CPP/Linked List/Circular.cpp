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
    Node *p = head;
    while(p -> next != head) {
        //cout<< "prev " << p -> prev << " curr " << p << " next " << p -> next << " value " << p -> value << endl;
        cout << p -> value << " ";
        p = p -> next;
    }
    //cout<< "prev " << p -> prev << " curr " << p << " next " << p -> next << " value " << p -> value << endl;
    cout << p -> value << endl;
}

void printTail(Node* tail) {
    Node *p = tail;
    while(p -> prev != tail) {
        cout << p -> value << " ";
        p = p -> prev;
    }
    cout << p -> value << endl;
}

void insertAtHeadOrTail(Node* &head, Node* &tail, int value, bool insertAtHead, int pos = 0) {
    // cout << tail -> value;
    Node* temp = new Node(value);
    if(!head) {
        head = temp;
        head -> next = head;
        head -> prev = head;
        tail = head;
    } else if(pos > 1) {
        Node* p = head;
        int i = 1;
        while(i < pos-1 && p != tail) {
            p = p -> next;
            i++;
        }
        //cout<< "hi " <<p->value << endl;
        if(p == tail) {
            tail = temp;
        }
        //cout << " p -> next " << p->next->value << endl;
        temp -> next = p -> next;
        temp -> prev = p;
        p -> next -> prev = temp;
        p -> next = temp;
    } else {
        temp -> next = head;
        temp -> prev = tail;
        tail -> next = temp;
        head -> prev = temp;
        if(insertAtHead == true) {
            head = temp;
        } else {
            tail = temp;
        }
    }
}

void deleteNode(Node* &head, Node* &tail, int pos) {
    if(!head) {
        return;
    }
    if(head == tail) {
        delete head;
        return;
    }
    if(pos > 0) {
        int i = 1;
        Node* p = head;
        if(pos == 1){
            head = p -> next;
        }   
        while(i < pos && p != tail) {
            p = p -> next;
            i++;
        }
        if(p == tail) {
            tail = p -> prev;
        }
        // cout << p->value << endl;
        // cout << p->prev-> value << endl;
        // cout<< p -> next -> prev -> value<< endl;
        p -> prev -> next = p -> next;
        p -> next -> prev = p -> prev;
        
        // cout << p -> prev -> next -> value << endl;
        // cout<< p -> next -> prev -> value<< endl;
        // print(head);
        delete p;
    }
}
void reverseCircularSingly(Node* &head, Node* &tail) {
    Node *prev = tail, *curr = head, *nxt = NULL;

    while(curr != tail) {
        nxt = curr -> next;
        curr -> next = prev;
        prev = curr;
        curr = nxt;
    }
    nxt = curr -> next;
        curr -> next = prev;
        prev = curr;
    head = prev;
}

void reverseCircularDoubly(Node* &head, Node* &tail) {
    Node *temp = NULL, *curr = head, *nxt = NULL;

    while(curr != tail) {
        nxt = curr -> next;
        curr -> next = curr -> prev;
        curr -> prev = nxt;
        curr = nxt;
    }
    nxt = curr -> next;
    curr -> next = curr -> prev;
    curr -> prev = nxt;

    temp = head;
    head = tail;
    tail = temp;

    return;
}


int main() {
    Node* head = NULL;
    Node* tail = NULL;

    insertAtHeadOrTail(head, tail, 10, false, 0);
    //cout<< head -> value << " " << tail -> value << endl;
    //print(head);
    //printTail(tail);
    //deleteNode(head, tail, 1);
    print(head);

    insertAtHeadOrTail(head, tail, 20, true, 0);
    cout<< head -> value << " " << tail -> value << endl;
    //print(head);
    // printTail(tail);

    insertAtHeadOrTail(head, tail, 30, false, 3);
    cout<< head -> value << " " << tail -> value << endl;
    print(head);
    // printTail(tail);

    insertAtHeadOrTail(head, tail, 40, false, 4);
    cout<< head -> value << " " << tail -> value << endl;
    print(head);

    //deleteNode(head, tail, 1);
    cout<< "hello " << head -> value << " " << tail -> value << endl;
    print(head);
    //printTail(tail);

    //printTail(tail);
    reverseCircularDoubly(head,tail);
    print(head);

    reverseCircularSingly(head, tail);
    print(head);

    
}