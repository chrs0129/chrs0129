package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        Integer num = 200;

        boolean r1 = list.remove(num);
        System.out.println(list);
        System.out.println(r1);
        System.out.println("---------------------------------");
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------------------------");
        boolean r2 = characters.contains('A');
        System.out.println(r2);


    }
}
