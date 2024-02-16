package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        LinkedList<Person> linkedList = new LinkedList<>();

        // Person nesnelerini ArrayList ve LinkedList'e ekleme
        arrayList.add(new Person(3, "Shahin", "Mammadov"));
        arrayList.add(new Person(1, "Ayxan", "Azayev"));
        arrayList.add(new Person(2, "Ceyhun", "Rzayev"));

        linkedList.add(new Person(3, "Mubariz", "Suleymanov"));
        linkedList.add(new Person(1, "Azer", "Axundov"));
        linkedList.add(new Person(2, "Kamal", "Samadov"));

        Collections.sort(arrayList);

        Collections.sort(linkedList);

        arrayList.addAll(linkedList);

        System.out.println("Merged list: " + arrayList);

        linkedList.clear();

        System.out.println("Merged list size: " + arrayList.size());
    }
}
