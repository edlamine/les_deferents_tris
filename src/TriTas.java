import java.util.ArrayList;
public class TriTas {
    public static void TriTas(ArrayList<Integer> list) {
        int n = list.size();                                       //Cet algorithme utilise une structure de données appelée tas binaire
        for (int i = n / 2 - 1; i >= 0; i--) {                     //pour organiser les éléments du tableau à trier.
            heapify(list, n, i);                                   //La méthode heapSort commence par construire un tas binaire à partir des éléments du tableau.
        }                                                          //Ensuite, le plus grand élément du tas est échangé avec le dernier élément du tableau
        for (int i = n - 1; i >= 0; i--) {                         //et le tas est réorganisé pour maintenir la propriété de tas.
            int temp = list.get(0);                                //Ce processus est répété pour chaque élément du tableau, ce qui donne une liste triée en ordre croissant.
            list.set(0, list.get(i));
            list.set(i, temp);
            heapify(list, i, 0);
        }
    }
    private static void heapify(ArrayList<Integer> list, int n, int i) {     // La méthode heapify est utilisée pour construire et maintenir le tas
                                                                             // en réorganisant les éléments si nécessaire.
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && list.get(left) > list.get(largest)) {
            largest = left;
        }
        if (right < n && list.get(right) > list.get(largest)) {
            largest = right;
        }
        if (largest != i) {
            int temp = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, temp);
            heapify(list, n, largest);
        }
    }
}





