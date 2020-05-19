package lab04;

public class ArrayStack implements Stack {

    final int MAX = 4;
    private int[] arr = new int[MAX];
    int top = -1;

    @Override
    public void push(int a) {
        arr[++top] = a;
    }

    @Override
    public int pop() {
        return arr[top--];
    }
}
