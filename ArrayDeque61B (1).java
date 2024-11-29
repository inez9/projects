package deque;
//import com.google.common.base.Objects;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ArrayDeque61B<T> implements Deque61B<T> {
    private T[] items;
    private int front;
    private int sizing;
    private int indexing;

    public ArrayDeque61B() {
        items = (T[]) new Object[8];
        front = 0;
        sizing = 0;
        indexing = 0;
    }

    @Override
    public void addFirst(T x) {
        if (sizing == items.length) {
            resize(items.length * 2);
        }
        front = (front - 1 + items.length) % items.length;
        items[front] = x;
        sizing++;
    }

    public void resize(int size) {
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < sizing; i++) {
            newArray[i] = items[(front + i) % items.length];
        }
        items = newArray;
        front = 0;
        indexing = sizing;
    }

    @Override
    public void addLast(T x) {
        if (sizing == items.length) {
            resize(items.length * 2);
        }
        items[indexing] = x;
        indexing = (indexing + 1) % items.length;
        sizing++;
    }

    @Override
    public List<T> toList() {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < sizing; i++) {
            list.add(items[(front + i) % items.length]);
        }
        return list;
    }

    @Override
    public boolean isEmpty() {
        return sizing == 0;
    }

    @Override
    public int size() {
        return sizing;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T removedItem = items[front];
        items[front] = null;
        front = (front + 1) % items.length;
        sizing--;
        if (sizing > 0 && items.length / 4 == sizing) {
            resize(items.length / 2);
        }
        return removedItem;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        indexing = (indexing - 1 + items.length) % items.length;
        T removedItem = items[indexing];
        items[indexing] = null;
        sizing--;
        if (sizing > 0 && items.length / 4 == sizing) {
            resize(items.length / 2);
        }
        return removedItem;
    }

    @Override
    public T get(int index) {
        if (index >= sizing || index < 0) {
            return null;
        }
        int currIndex = (front + index) % items.length;
        return items[currIndex];
    }

    @Override
    public T getRecursive(int index) {
        throw new UnsupportedOperationException("No need to implement getRecursive for proj 1b");
    }

    @Override
    public Iterator<T> iterator() {
        return new Buddy<T>();
    }

    public class Buddy<T> implements Iterator<T> {
        private int position;
        private int total;

        public Buddy() {
            position = front;
            total = sizing;

        }

        @Override
        public boolean hasNext() {
            return position != indexing;
        }

        @Override
        public T next() {
            T returnItem = (T) items[position];
            if (hasNext()) {
                position = (position + 1) % items.length;
                return returnItem;
            }
            return returnItem;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Deque61B<?> o) {
            for (int i = 0; i < o.size(); i++) {
                if (!o.get(i).equals(this.get(i))) {
                    return false;
                }
            }
            return (o.size() == this.sizing);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("[");
        for (int i = 0; i < sizing - 1; i++) {
            returnString.append(items[i].toString());
            returnString.append(", ");
        }
        returnString.append(items[sizing - 1]);
        returnString.append("]");
        return returnString.toString();
    }
}
