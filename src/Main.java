import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        //int min = 0;
        //int max = 1000000;
        int size = 10;


        // Test tri à Bulles
        ArrayList<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<size; i++){
            intList.add(random.nextInt(size));
        }
        System.out.println("Avant : "+intList);
        TriBulles.TriBulles(intList);
        System.out.println("Après le TriBulles : " + intList);





        // Test Tri par fusion
        //int[] array = new int[size];
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(15);
        list.add(8);
        list.add(6);
        list.add(4);
        list.add(2);
        System.out.println("Avant : "+ list);
        Collections.sort(list);
        System.out.println("Après le TriParFusion : " +list);
        /*for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(size);
        }
        System.out.println("Avant : "+ array);
        TriFusion.mergeSort(array);
        System.out.println("Après le TriParFusion : " + Arrays.toString(array));*/

        /*int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = min+random.nextInt(max-min);
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int value : array) {
            list.add(value);
        }
        LinkedList<Integer> result = TriFusion.merge(list, list);
        System.out.println("TriParFusion : " + result);*/




        //Test Tri Rapide
        //ist<Integer> intList2 = new ArrayList<Integer>();
        ArrayList<Integer> intList2 = new ArrayList<>();
        for (int i=0; i<size; i++){
            intList2.add(random.nextInt(size));
        }
        System.out.println("Avant : "+intList2);
        TriRapide triRapide = new TriRapide();
        TriRapide.TriRapide(intList2,0,size-1);
        System.out.println("Après le TriRapide : "+intList2);
        /*System.out.println("Liste avant tri : " + intList2);
        int[] tableau = intList2.stream().mapToInt(i -> i).toArray();
        Arrays.sort(tableau);
        intList2 = new ArrayList<Integer>();
        for (int i = 0; i < tableau.length; i++) {
            intList2.add(tableau[i]);
        }
        System.out.println("Liste après TriRapide : "+intList2);*/





        //Test Tri par tas
        ArrayList<Integer> intList3 = new ArrayList<>();
        //Random random = new Random();
        for (int i=0; i<size; i++){
            intList3.add(random.nextInt(size));
        }
        System.out.println("Avant : "+intList3);
        TriTas triTas = new TriTas();
        triTas.TriTas(intList3);
        System.out.println("Après le TriTas : "+intList3);
    }
}


