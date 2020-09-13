package service;

import model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1,new Dictionary("hello", "xin chao"));
        dictionaries.put(2,new Dictionary("dog", "xin chao"));
        dictionaries.put(3,new Dictionary("cat", "xin chao"));
        dictionaries.put(4,new Dictionary("ahihi", "xin chao"));
        dictionaries.put(5,new Dictionary("goodbye", "tam biet"));
        dictionaries.put(6,new Dictionary("rat", "con chuot"));
    }

    public List<Dictionary> findAll(){
        return new ArrayList<>(dictionaries.values());
    }
}
