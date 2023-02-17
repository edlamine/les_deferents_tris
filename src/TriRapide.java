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

    /*public static void triRapide(int[] T, int g, int d) {
        if (g < d) {
            //int n = d - g + 1;
            int a = g;
            int b = d;
            int pivot = T[(a + b) / 2];

            while (a <= b) {
                while (T[a] < pivot) {
                    a++;
                }
                while (T[b] > pivot) {
                    b--;
                }
                if (a <= b) {
                    int temp = T[a];
                    T[a] = T[b];
                    T[b] = temp;
                    a++;
                    b--;
                }
            }
            triRapide(T, g, b);
            triRapide(T, a, d);
        }
    }*/
}

