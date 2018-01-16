package com.collection.Iterable;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface Iterator<E> {
    boolean hasNext();
    E next();
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
