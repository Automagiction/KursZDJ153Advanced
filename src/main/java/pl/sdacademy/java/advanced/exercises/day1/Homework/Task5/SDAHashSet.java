package pl.sdacademy.java.advanced.exercises.day1.Homework.Task5;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class SDAHashSet<E> {
    // private final E content;
    private final HashMap<Integer, Object> cell = new HashMap<>();
    private int i = 0;

    //    public SDAHashSet(E content) {
//        this.content = content;
//    }
//
//    public E getContent() {
//        return content;
//    }
    public void add(E content) {
        if (cell.containsValue(content)) {
            System.out.println("Element is already added");
        } else {
            cell.put(i, content);
            i++;
        }
    }

    public void remove(E content) {
        Integer keyNumberToRemove;
        if (cell.containsValue(content)) {
            for (Map.Entry<Integer, Object> element : cell.entrySet()) {
                if (element.getValue() == content) {
                    keyNumberToRemove = element.getKey();
                    cell.remove(keyNumberToRemove);
                }
            }
        } else {
            System.out.println("Element not exist in SDAHashSet");
        }
    }

    public int size() {
        return cell.size();
    }

    public boolean contains(E content) {
        return cell.containsValue(content);
    }

    public void clear() {
        cell.clear();
    }
//
//    @Override
//    public void <E> E[] toArray(E[] a) {
//        return cell.values().toArray(a);
//    }
   public void print() {
       for (Map.Entry<Integer, Object> element : cell.entrySet()) {
           System.out.println(element.getValue());
       }
   }

}
