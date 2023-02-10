import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 1000000;
        int size = 10000;


        // Test tri à Bulles
        ArrayList<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<size; i++){
            intList.add(min + random.nextInt(max-min));
        }
        TriBulles.TriBulles(intList);
        System.out.println("TriBulles : " + intList);





        // Test Tri par fusion
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = min+random.nextInt(max-min);
        }
        TriFusion.sort(array);
        System.out.println("TriParFusion : " + Arrays.toString(array));



        //Test Tri Rapide
        ArrayList intList2 = new ArrayList();
        for (int i=0; i<size; i++){
            intList2.add(min + random.nextInt(max-min));
        }
        TriRapide triRapide = new TriRapide();
        TriRapide.TriRapide(intList2,0,size-1);
        System.out.println("TriRapide : "+intList2);





        //Test Tri par tas
        ArrayList<Integer> intList3 = new ArrayList<>();
        //Random random = new Random();
        for (int i=0; i<size; i++){
            intList3.add(min + random.nextInt(max-min));
        }
        TriTas triTas = new TriTas();
        triTas.heapSort(intList3);
        System.out.println("TriTas : "+intList3);
    }
}


