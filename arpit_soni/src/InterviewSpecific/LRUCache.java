
package InterviewSpecific;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;
    public LRUCache(int capacity){
       super(capacity, 0.7f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args){

        LRUCache cache = new LRUCache(3);

        cache.put("arpit", 14);
        cache.put("ayush", 15);
        cache.put("saransh", 16);
        cache.get("arpit");
        cache.put("soni", 15);


        System.out.println(cache);
    }

}
