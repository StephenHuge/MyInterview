package com.interw.os;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/8.
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int cacheSize;

    public LRUCache(int cacheSize) {
        super(16, 0.75f, true);
        this.cacheSize = cacheSize;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
//        super.removeEldestEntry(eldest);
        return size() > cacheSize;
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> caches = new LRUCache<>(3);
        int len = 5;
        for (int i = 0; i < len; i++) {
            caches.put(i, new String("test" + i));
        }
        System.out.println(caches.size());
        for (Map.Entry<Integer, String> entry : caches.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
