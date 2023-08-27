import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            //task1
        }
        System.out.println("task1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};

        String[] stringArray = new String[4];
        stringArray[0] = "Hello";
        stringArray[1] = "world";
        stringArray[2] = "!";
        stringArray[3] = "Java";

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        //task 2
        System.out.println("task2");

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);


            if (i < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);

            if (i < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task3
        System.out.println("task3");
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task 4
        System.out.println("task4");

    }
}