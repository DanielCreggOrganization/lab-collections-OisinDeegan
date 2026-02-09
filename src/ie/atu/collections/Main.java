package ie.atu.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);

        System.out.println(numList);
        String[] bananas={"Green","Yellow","Brown"};

        List<String> bananList = new ArrayList<>(Arrays.asList(bananas));
        
        bananList.add("Black");
        System.out.println(bananList);

        List<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Purple");

        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        };
        System.out.println();

        ListIterator<String> iterationDevice = colors.listIterator(1);

        iterationDevice.add("Black");
        iterationDevice.next();
        iterationDevice.set("White");
        
        while (iterationDevice.hasPrevious()) {
            iterationDevice.previous();
        }

        while (iterationDevice.hasNext()) {
            System.out.println(iterationDevice.next());
        }
        System.out.println();
        while (iterationDevice.hasPrevious()) {
            System.out.println(iterationDevice.previous());
        }
        System.out.println();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long arrayStartTime = System.nanoTime();
        
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        // Access random element
        System.out.println("ArrayList element at index 5: " + arrayList.get(5));

        // Insertion in the middle
        arrayList.add(5, 100);

        System.out.println("ArrayList after insertion: " + arrayList);
        long arrayEndTime = System.nanoTime();
        System.out.println();
        long linkedSTartTime = System.nanoTime();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        System.out.println("LinkedList element at index 5: " + linkedList.get(5));

        linkedList.add(5, 100);

        System.out.println("LinkedList after insertion: " + linkedList);
        long linkedEndTime = System.nanoTime();
        System.out.println();

        System.out.println("Duration of ArrayList: "+(arrayEndTime-arrayStartTime));
        System.out.println("Duration of LinkedList: "+(linkedEndTime-linkedSTartTime));

        ArrayList<Integer> exercise6 = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            exercise6.add(i);
        }
        Iterator<Integer> it = exercise6.iterator();

        while(it.hasNext()){
            if ((it.next()%2==0)) {
                it.remove();
            }
        }
        System.out.println(exercise6);
        System.out.println(exercise6.size());
        
        System.out.println();
        List<Book> libraryAssortment = new ArrayList<>();

        libraryAssortment.add(new Book("LoTR", "JRR TOLKIEN", 12));
        libraryAssortment.add(new Book("1984", "Jorjor Well", 1984));
        libraryAssortment.add(new Book("Cooking da pizza like Mamma used to make it", "Chef Mamma-ioli", 10));
        System.out.println("List of books in the library");
        for (Book book : libraryAssortment) {
            System.out.println(book);
        }
        System.out.println();
        System.out.println("List of books after someone brought one back and borrowed a new one:");
        libraryAssortment.remove(new Book("Cooking da pizza like Mamma used to make it", "Chef Mamma-ioli", 10));

        libraryAssortment.add(2, new Book("The End Times", "James Workshop", 1));
        libraryAssortment.remove(0);
        for (Book book : libraryAssortment) {
            System.out.println(book);
        }

        

    }
}

