package lab06;

public class Client {
    public static void main(String[] args) {

        SimpleInterface si = () -> System.out.println("Hello");
        si.perform();

        si = () -> System.out.println("World");
        si.perform();

        Numbering check = (n) -> (n % 2) != 0;

        if (check.is(24)) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        check = (n) -> n > 5;
        if (check.is(56)) {
            System.out.println(">5");
        }

    }
}
