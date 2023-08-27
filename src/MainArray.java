


//task4
public class MainArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 10, 13, 15}; // пример исходного массива

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

