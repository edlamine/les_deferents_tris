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