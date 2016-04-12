package com.jeremiemartinez.devoxx.truth;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final Map<Item, Integer> content = new HashMap<>();

    public Cart(Item... items) {
        for (Item item : items) {
            addItem(item);
        }
    }

    public void removeItem(Item item) {
        content.remove(item);
    }

    public void addItem(Item item) {
        if (content.containsKey(item)) {
            content.put(item, content.get(item) + 1);
        } else {
            content.put(item, 1);
        }
    }

    public double total() {
        return content.entrySet().stream().
                mapToDouble(entry -> entry.getValue() * entry.getKey().price).
                sum();
    }

    public int count() {
        return content.values().stream().
                mapToInt(Integer::intValue).
                sum();
    }

    public void clear() {
        content.clear();
    }

    public Map<Item, Integer> content() {
        return content;
    }

    public static class Item {

        public final long id;
        public final String description;
        public final double price;

        public Item(long id, String description, double price) {
            this.id = id;
            this.description = description;
            this.price = price;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Item item = (Item) o;

            return id == item.id;

        }

        @Override
        public int hashCode() {
            return (int) (id ^ (id >>> 32));
        }
    }

}