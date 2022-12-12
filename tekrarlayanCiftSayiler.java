package Giris;
import java.util.Arrays;
public class tekrarlayanCiftSayiler {
            static boolean isFinde(int[] arr, int value) {
                for (int i : arr) {
                    if (i == value) {
                        return true;
                    }
                }
                return false;
            }

            public static void main(String[] args) {
                int[] list = {2,5,7,9,85,22,2,4,6,22,4,6};
                System.out.println("Dizi : " + Arrays.toString(list));
                int[] dublicate = new int[list.length];
                int startIndex = 0;
                for (int i = 0; i < list.length; i++) {
                    for (int j = 0; j < list.length; j++) {
                        if ((i != j) && (list[i] == list[j])) {
                            if (list[i] % 2 == 0) {
                                if (!isFinde(dublicate, list[i])) {
                                    dublicate[startIndex++] = list[i];
                                }
                                break;
                            }
                        }
                    }
                }
                System.out.println("Tekrar eden çift sayılar : " );
                for (int value : dublicate) {
                    if (value != 0) {
                        System.out.println(value);


            }
}}}