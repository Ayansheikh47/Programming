import java.util.Arrays;

public class CopyArrayUBIF {
    public static void main(String[] args) {

        int arr1[] = {10, 20, 30, 40, 50};

        int arr2[] = Arrays.copyOf(arr1, arr1.length);

        System.out.println(Arrays.toString(arr2));
    }
}