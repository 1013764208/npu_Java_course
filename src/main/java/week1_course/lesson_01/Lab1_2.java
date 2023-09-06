package week1_course.lesson_01;
import java.util.Scanner;

public class Lab1_2 {
    public void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Lab1_2 lab12 = new Lab1_2();

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数组的长度: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("请输入数组的元素:");
        for (int i = 0; i < size; i++) {
            System.out.print("元素 " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        lab12.bubbleSort(arr);

        System.out.println("输入的数组为:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // 关闭Scanner对象
        scanner.close();
    }
}


