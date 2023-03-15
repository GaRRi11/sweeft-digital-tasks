package org.gary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task6<T> {
    private ArrayList<T> items;
    private Map<T, Integer> indices;

    public Task6() {
        items = new ArrayList<>();
        indices = new HashMap<>();
    }

    public void add(T item) {
        if (!indices.containsKey(item)) {
            items.add(item);
            indices.put(item, items.size() - 1);
        }
    }

    public void delete(T item) {
        if (indices.containsKey(item)) {
            int index = indices.get(item);
            T lastItem = items.get(items.size() - 1);
            items.set(index, lastItem);
            indices.put(lastItem, index);
            items.remove(items.size() - 1);
            indices.remove(item);
        }
    }

    public int size() {
        return items.size();
    }

    public T get(int index) {
        return items.get(index);
    }
}
