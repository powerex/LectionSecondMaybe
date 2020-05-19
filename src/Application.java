import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void printArray(int[] arr, int size) {
        for (int i=0; i<size; ++i) {
            System.out.print(String.format("%3d", arr[i]));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        final int N = 10;

        Random generator = new Random();

        int[] arrayInt = {23, 12, 34, 1, 99, 44, 52, 31, 9, 17};
//        arrayInt = new int[N];
//        for (int i=0; i<N; ++i) {
//            arrayInt[i] = generator.nextInt(100);
//        }
        printArray(arrayInt, N);

        Arrays.sort(arrayInt);
//        Arrays.stream(arrayInt).forEach(System.out::println);
        printArray(arrayInt, N);

//        System.out.println("Enter number to insert");
//        Scanner reader = new Scanner(System.in);
//        String s = reader.next();
//        int x = Integer.parseInt(s);

        int x = 30;

        int[] newArray = new int[N+1];
        for (int i=0; i<N; ++i) {
            newArray[i] = arrayInt[i];
        }
        arrayInt = newArray;

        printArray(arrayInt, N+1);

        int insertIndex = 0;
        while (x > arrayInt[insertIndex])
            insertIndex++;

        System.out.println("insertIndex = " + insertIndex);

        for (int i=N; i>insertIndex; --i) {
            arrayInt[i] = arrayInt[i-1];
        }
        printArray(arrayInt, N+1);


        arrayInt[insertIndex] = x;
        printArray(arrayInt, N+1);
    }
}
