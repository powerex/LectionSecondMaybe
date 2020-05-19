package lab04;

public class ListStack implements Stack {

    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void push(int a) {
        Node newNode = new Node(a);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public int pop() {
        Node tmp = head;
        head = head.next;
        return tmp.data;
    }
}
