package ListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> name = new ArrayList<>();
        name.add("Tithi");
        name.add("Nusrat");
        name.add("Anisa");
//        System.out.println(name);
//        System.out.println(name.get(1));
//        name.set(0, "Fariha");
//        System.out.println(name);
//        name.remove(0);
//        System.out.println(name);
//        name.clear();
//        System.out.println(name);
//        for (int i = 0; i<name.size();i++){
//            System.out.println(name.get(i));
//        }
        System.out.println("names: ");
        for (String n: name) {
            System.out.println(n);
        }
        Collections.sort(name);
        System.out.println("after sorting, names: ");
        for (String n: name) {
            System.out.println(n);
        }
        ArrayList <Integer> age = new ArrayList<>();
        age.add(12);
        age.add(33);
        age.add(5);
        age.add(43);
        System.out.println("age: ");
        for (int n: age) {
            System.out.println(n);
        }
        Collections.sort(age);
        System.out.println("After sorting, age: ");
//        for (int n: age) {
//            System.out.println(n);
//        }
        Iterator itr = age.iterator();
        while   (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
