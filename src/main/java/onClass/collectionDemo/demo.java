package onClass.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {
    public static void main (String[] args){
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 110; i++){
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

//        Iterator iter = list.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
    }
}
