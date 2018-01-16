package com.collection;

import com.collection.Iterable.Iterator;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface List<E> extends Collection<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<E> iterator();

    boolean add(E e);

    boolean remove(Object o);
}
