package com.designpattern.observer;

/**
 * Created by Administrator on 2018/1/17.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
