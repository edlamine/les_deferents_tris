import java.util.ArrayList;
public class TriTas {
    public static void TriTas(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);
            heapify(list, i, 0);
        }
    }
    private static void heapify(ArrayList<Integer> list, int n, int i) { //la methodes qui entasse l'arbre
        int plusGrand = i;
        int filsGauche = 2 * i + 1;
        int filsDroit = 2 * i + 2;
        if (filsGauche < n && list.get(filsGauche) > list.get(plusGrand)) {
            plusGrand = filsGauche;
        }
        if (filsDroit < n && list.get(filsDroit) > list.get(plusGrand)) {
            plusGrand = filsDroit;
        }
        if (plusGrand != i) {
            int temp = list.get(i);
            list.set(i, list.get(plusGrand));
            list.set(plusGrand, temp);
            heapify(list, n, plusGrand);
        }
    }
}





