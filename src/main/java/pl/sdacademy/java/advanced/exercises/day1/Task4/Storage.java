package pl.sdacademy.java.advanced.exercises.day1.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public Map<String, List<String>> getStorage() {
        return storage;
    }

    //    public String addToStorage2 (String key, String value){
//        if(storage.containsKey(key)){
////            for(Map.Entry<String, List<String>> element :storage.entrySet()){
////
////            }
//            List<String> list = new ArrayList<>();
//            list.add(value);
//            storage.put(key, list);
//        }
//    }
    public void addToStorage(String key, String value) {
        if(storage.containsKey(key)){
            //dodaj/zmodyfikuj nową wartość do value czyli do listy
            storage.get(key).add(value);
        } else {
            //dodaj nowy klucz z daną wawrtością
            List<String> elements = new ArrayList<>();
            elements.add(value);
            storage.put(key, elements);

        }
    }
    public void printValues(String key) {
        System.out.println(storage.get(key));
    }
    public List<String> findKeysByValue (String searchedValue) {
        return storage.entrySet().stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                //.map(entry -> entry.getKey())
                .map(Map.Entry::getKey)
                .toList();
    }

}
