import java.util.ArrayList;

public class TriBulles {
    public static void TriBulles(ArrayList<Integer> list) {
        int n = list.size();                    //Cette méthode prend en entrée une liste d'entiers (ArrayList) et trie ces entiers en utilisant l'algorithme de tri par bulles.
        for (int i = 0; i < n-1; i++) {                   //L'algorithme de tri par bulles consiste à répéter des comparaisons entre les éléments adjacents de la liste et
            for (int j = 0; j < n-i-1; j++) {            //à les échanger si nécessaire jusqu'à ce que la liste soit triée dans l'ordre croissant.
                if (list.get(j) > list.get(j+1)) {      //La méthode utilise deux boucles pour parcourir tous les éléments de la liste et les trier en conséquence.
                    // échange les éléments
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
}
