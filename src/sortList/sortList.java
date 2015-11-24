package sortList;

import java.util.*;

class Comp implements  Comparator<Comp>{

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String name;

    public Comp(){
    }

    public Comp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Comp c1, Comp c2) {
        int result = c1.getName().compareToIgnoreCase(c2.getName());
        if (result < 0){
            return 1;
        }else if (result > 0){
            return -1;
        }
        return 0;
    }

    //    @Override
//    public int compare(Comp c1, Comp c2) {
//
//        int result  = 0;
//        int firstCh = 0;
//        int secCh   = 1;
//
//        while (true){
//            ArrayList<Integer> l = intFromAlphabet(c1, c2, firstCh, secCh);
//
//            result = l.get(1) - l.get(0);
//
//            if (result != 0) {
//                break;
//            } else {
//                firstCh ++;
//                secCh ++;
//            }
//        }
//
//        return result;
//    }
//
//    private ArrayList<Integer> intFromAlphabet(Comp c1, Comp c2, int firstCh, int secondCh){
//        ArrayList<Integer> result = new ArrayList<>(2);
//
//        String s1 = c1.getName().substring(firstCh,secondCh).toUpperCase();
//        int s1Int = alphabet.indexOf(s1);
//
//        String s2 = c2.getName().substring(firstCh,secondCh).toUpperCase();
//        int s2Int = alphabet.indexOf(s2);
//
//        result.add(s1Int);
//        result.add(s2Int);
//
//        return result;
//    }

}


public class SortList {

    public static void main(String[] args) {

        List<Comp> sl = new ArrayList<>(10);

        sl.add(new Comp("one"));
        sl.add(new Comp("two"));
        sl.add(new Comp("three"));
        sl.add(new Comp("four"));
        sl.add(new Comp("five"));
        sl.add(new Comp("six"));
        sl.add(new Comp("seven"));
        sl.add(new Comp("eight"));
        sl.add(new Comp("nine"));
        sl.add(new Comp("ten"));

//        Collections.sort(sl, new Comp());
        Collections.sort(sl, new Comparator<Comp>() {
            @Override

            public int compare(Comp c1, Comp c2) {
                int result = c1.getName().compareToIgnoreCase(c2.getName());
                if (result < 0){
                    return 1;
                }else if (result > 0){
                    return -1;
                }
                return 0;
            }
        });

        for (Comp c: sl) {
            System.out.println(c.getName()+", ");
        }
    }

}



