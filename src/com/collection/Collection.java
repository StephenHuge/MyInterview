package com.collection;


import com.collection.Iterable.Iterator;
import com.collection.Iterable.Iterable;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface Collection<E> extends Iterable<E> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    boolean add(E e);

    boolean remove(Object o);

    Iterator<E> iterator();

}
