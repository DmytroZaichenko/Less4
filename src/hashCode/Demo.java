package hashCode;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        HashMap<Integer, Person> staff = new HashMap<>();

        Person person = new Person("Dmytro",38);
        staff.put(person.hashCode(),person);

        person = new Person("Petro",39);
        staff.put(person.hashCode(),person);

        person = new Person("Petro",35);
        staff.put(person.hashCode(),person);

        person = new Person("Oleg",34);
        staff.put(person.hashCode(),person);

        Iterator<Integer> iKey = staff.keySet().iterator();
        while (iKey.hasNext()){
            System.out.println("Key: " + iKey.next());
        }

        Set<Map.Entry<Integer, Person>> entrySet = staff.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
            System.out.println("key: " + entry.getKey() + "value: " + entry.getValue());
        }

        System.out.println();

        iKey = staff.keySet().iterator();
        while (iKey.hasNext()){
            Integer key = iKey.next();
            System.out.println("key: " + key + "value: " + staff.get(key).toString());
        }

        Map<Integer, Person> rt = new TreeMap<>();




        //Map<Integer,Person> entSet = staff.entrySet();






//        //key set
//        System.out.println(Arrays.toString(staff.keySet().toArray()));
//        Person person3 = new Person("Name",23);
//
//        System.out.println("Does hashMap contains Oleg as value: " + staff.containsValue(new Person("Oleg",34)));
//        System.out.println("Is hashMap is empty: " + staff.isEmpty());
//
//        Integer key = new Person("Petro",35).hashCode();
//        Object value = staff.remove(key);
//
//        System.out.println("Following value is removed from Map: " + value);
//
//        System.out.println("Unsorted HashMap: " + staff);
//
//        TreeMap sortedHashMap = new TreeMap(staff);
//        System.out.println("Sorted HashMap: " + sortedHashMap);
//
//        LinkedList<String> ll = new LinkedList<>();
//        ll.add(0,"123");
//        System.out.println(ll.get(0));
//        System.out.println(ll.hashCode());



//        Map.Entry<Integer, Person> ent = new Map.Entry<Integer, Person>();
//        staff.entrySet().add()



//        Person p  = staff.get(new Person("Dmytro",38).hashCode());
//        System.out.println(p != null ? p.getName(): "null");
//        System.out.println(staff.get(person.hashCode()).getName());
//        Person p1 = staff.get(new Person("Dmytro",38));
//        System.out.println(p1.toString());

//        Person p = staff.get("Dmytro");
//        try {
//            System.out.println("age: "+p.getAge());
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }
//
//        staff.put("Dmytro",new Person("Dmytro",39));
//        System.out.println("age: "+staff.get("Dmytro").getAge());
//
//
//        System.out.println(staff.size());
//
//        for (String key: staff.keySet()) {
//            System.out.println(key);
//        }
//
//        for(Map.Entry entry: staff.entrySet()){
//            String key = (String) entry.getKey();
//            Person value = (Person) entry.getValue();
//            System.out.println("Key: "+key+" Value: "+value);
//        }
//
//
//        //System.out.println(Arrays.toString(arr));



    }

}
