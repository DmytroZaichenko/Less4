package hashCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Map<String, Person> staff = new HashMap<>();
        Person person = new Person("Dmytro",38);

        staff.put(person.getName(),person);

        Person p = staff.get("Dmytro");
        try {
            System.out.println("age: "+p.getAge());
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println(staff.size());

        for (String key: staff.keySet()) {
            System.out.println(key);
        }

        for(Map.Entry entry: staff.entrySet()){
            String key = (String) entry.getKey();
            Person value = (Person) entry.getValue();
            System.out.println("Key: "+key+" Value: "+value);
        }


        //System.out.println(Arrays.toString(arr));



    }

}
