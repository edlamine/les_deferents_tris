/*public class TriFusion {

    public static void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        sort(array, helper, 0, array.length - 1);
    }

    private static void sort(int[] array, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            sort(array, helper, low, middle);
            sort(array, helper, middle + 1, high);
            merge(array, helper, low, middle, high);
        }
    }

    private static void merge(int[] array, int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}*/

import java.util.LinkedList;

public class TriFusion {
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();

        for (int i = 0; i < mid; i++) {
            left.add(list.remove());
        }

        while (!list.isEmpty()) {
            right.add(list.remove());
        }

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> result = new LinkedList<>();
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.peek() <= right.peek()) {
                result.add(left.remove());
            } else {
                result.add(right.remove());
            }
        }

        while (!left.isEmpty()) {
            result.add(left.remove());
        }

        while (!right.isEmpty()) {
            result.add(right.remove());
        }

        return result;
    }
}