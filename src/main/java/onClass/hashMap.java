package onClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class hashMap {
    public static void main (String[] args){
        HashMap map = new HashMap();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        Iterator iterator = map.keySet().iterator();
        for (int i =0; i < 4; i++){
            Object key = iterator.next();
            System.out.println(map.get(key));
        }
    }
}
