package lab04;

public class Client {

    public static void main(String[] args) {

        Stack aStack = new ListStack();

        aStack.push(2);
        aStack.push(4);
        aStack.push(6);
        aStack.push(8);

        System.out.println(aStack.pop());
        System.out.println(aStack.pop());
        System.out.println(aStack.pop());

    }

}
