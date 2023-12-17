package ru.mirea.lab_26.num_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Artem");
        names.add("Sasha");
        names.add("Vadim");

        CustomListIterator<String> iterator = new CustomListIterator<>(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
