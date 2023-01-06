import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    public static void shiftOne(List<Integer> list) {


        Integer[] arr = new Integer[list.size()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;

                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }




    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1);
        System.out.println(list);
        shiftOne(list);
    }
}



