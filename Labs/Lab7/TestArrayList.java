package Labs.Lab7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Артём");
        names.add("Дима");
        names.add("Ваня");
        names.add("Вася");
        names.add("Вася");
        System.out.println(names);
        names.set(2, "Рома");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        System.out.println(names.indexOf("Дима"));
        System.out.println(names.lastIndexOf("Вася"));
        System.out.println(names.indexOf("Артём"));
    }
}
