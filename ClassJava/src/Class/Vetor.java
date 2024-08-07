package Class;

import java.util.Arrays;

public class Vetor {
    private int[] arr;
    private int length;

    public Vetor(int capacity) {
        this.arr = new int[capacity];
        this.length = 0;
    }

    public boolean add(int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return false;
            }
        }
        this.arr[length] = number;
        this.length++;
        return true;
    }

    public boolean remove(int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                this.arr[i] = number;
                this.length--;
                return true;
            }
        }
        return false;
    }

    public void showArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
