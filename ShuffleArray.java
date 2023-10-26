import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);
        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }

    public static void shuffleArray(int[] arr) {
        Random random = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap arr[i] and arr[index]
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
