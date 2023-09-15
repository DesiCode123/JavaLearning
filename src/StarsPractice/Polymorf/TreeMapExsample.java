package StarsPractice.Polymorf;

import java.util.TreeMap;

public class TreeMapExsample {
    public static void main(String[] args) {
        TreeMap<String,Integer> students = new TreeMap<>();
        students.put("Sharmila",1);
        students.put("Desi",2);
        students.put("Sema",3);
        System.out.println("students list in order with id "+students);

        students.remove("Sharmila");
        System.out.println("liste etter å ha fjernet sudent nr 1 "+students);
    }
}
