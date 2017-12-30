import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = { 4, 5, 1, 2, 9, -3 };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for searching : ");
        int n = input.nextInt();
        System.out.println(linearSearch(list, n));
    }
}