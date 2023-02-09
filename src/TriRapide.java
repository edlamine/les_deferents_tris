import java.util.ArrayList;

public class TriRapide {

    public static void TriRapide(ArrayList<Integer> list, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(list, start, end);
            TriRapide(list, start, partitionIndex - 1);
            TriRapide(list, partitionIndex + 1, end);
        }
    }

    private static int partition(ArrayList<Integer> list, int start, int end) {
        int pivot = list.get(end);
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (list.get(j) <= pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(end));
        list.set(end, temp);
        return i + 1;
    }
}