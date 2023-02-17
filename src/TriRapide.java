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
        int pivotIndex = (start + end) / 2;
        int pivotValue = list.get(pivotIndex);
        permutation(list, pivotIndex, end);
        int storeIndex = start;
        for (int i = start; i < end; i++) {
            if (list.get(i) < pivotValue) {
                permutation(list, i, storeIndex);
                storeIndex++;
            }
        }
        permutation(list, storeIndex, end);
        return storeIndex;
    }

    private static void permutation(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
/*Notez que le pivot est choisi comme étant l'élément au milieu de la liste.
Ensuite, la méthode partition parcourt la liste à partir de start jusqu'à end-1,
en comparant chaque élément à la valeur du pivot, et en plaçant les éléments plus petits
que le pivot au début de la liste, et les éléments plus grands que le pivot à la fin de la liste.
Enfin, elle place le pivot à sa position finale, entre les éléments plus petits et les éléments plus grands.
 */


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


