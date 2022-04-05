package Linked_Lists;

public class FindIntersection {
    static class LinkedList {
        Node head1, head2;
    }

    static class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node findIntersection(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

            if (ptr1 != null)
                System.out.print(ptr1);
            if (ptr2 != null)
                System.out.print(" " + ptr2);
            System.out.println();
            if (ptr1 == ptr2) {
                System.out.println(ptr1);
                return ptr1;
            }

            if (ptr1 == null) {
                ptr1 = head2;
            }
            if (ptr2 == null) {
                ptr2 = head1;
            }

        }
        return ptr1;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1, new Node(5, new Node(3, new Node(5, new Node(3,
                new Node(3, null))))));
        Node head2 = new Node(1, new Node(2, new Node(3, new Node(4, head1.next.next))));

        Node intersect = findIntersection(head1, head2);
        if (intersect != null)
            System.out.println("Intersection = " + intersect.value);
        else
            System.out.println("No intersection");
    }
}
