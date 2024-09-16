import java.io.File;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] l = { 12, 5, -3, 5, 42, 37, 5, 0, -21 };

        Set<Integer> myTreeSet = new TreeSet<>();
        Set<Integer> myHashSet = new HashSet<>();
        Queue<Integer> myLIFO = new ArrayDeque<>();
        Queue<Integer> myFIFO = new ArrayDeque<>();
        Queue<Integer> myHeap = new PriorityQueue<>();
        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();

        myTreeSet.addAll(Arrays.asList(l));
        myHashSet.addAll(Arrays.asList(l));
        myLIFO.addAll(Arrays.asList(l));
        myFIFO.addAll(Arrays.asList(l));
        myHeap.addAll(Arrays.asList(l));
        myArrayList.addAll(Arrays.asList(l));
        myLinkedList.addAll(Arrays.asList(l));

        for (Integer i : myTreeSet) {
            System.out.print(i + " "); // -21 -3 0 5 12 37 42 không trùng nhau
        }
        System.out.println();
        for (Integer i : myHashSet) {
            System.out.print(i + " "); // 0 -3 -21 5 37 42 12
        }
        System.out.println();
        Iterator<Integer> iteratorLIFO = myLIFO.iterator();
        while (iteratorLIFO.hasNext()) {
            System.out.print(iteratorLIFO.next() + " ");
        }
        System.out.println();
        for (Integer i : myLIFO) {
            System.out.print(i + " "); // 12 5 -3 -5 42 37 5 0 -21
        }
        System.out.println();
        System.out.println("myFIFO (LinkedList as queue):");
        Iterator<Integer> fifoIterator = myFIFO.iterator();
        while (fifoIterator.hasNext()) {
            System.out.print(fifoIterator.next() + " ");
        }

        System.out.println();
        for (Integer i : myFIFO) {

            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : myHeap) {
            System.out.print(i + " "); // -21 -3 5 0 42 37 5 12 5
        }
        System.out.println();
        for (Integer i : myArrayList) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : myLinkedList) {
            System.out.print(i + " ");
        }

        // 1.File d’impression d’une imprimante. Les jobs rentrent en fin de Liste, et
        // sont traités dans leur ordre d’arrivée => myFIFO
        // 2.Top-N des chansons les plus écoutées sur Spotify. La chanson en ième
        // position est la ième plus écoutée => TreeSet
        // 3. Liste des étudiants du module de PO. La Liste est construite une fois au
        // début du semestre, puis est
        // peu modifiée. Les traitements consistent à mettre à jour la présence et les
        // notes de chaque étudiant
        // (en appelant des méthodes de la classe Etudiant). => ArrayList
        // 4. Liste des onglets d’un navigateur web. La Liste est très dynamique : on
        // peut ajouter des onglets et en retirer n’importe où dans la Liste. =>
        // LinkedList
        // 5. Liste représentant une ligne dans une image, chaque élément de la ligne
        // est un pixel. => ArrayList

        int nbValeurs = 100000 /* 100,000 */;
        int nbTirages = 50000 /* 50,000 */;
    }

}
