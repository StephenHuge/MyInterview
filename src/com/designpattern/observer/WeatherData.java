package com.designpattern.observer;


import java.util.ArrayList;

/**
 * Created by Administrator on 2018/1/17.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private boolean changed = false;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if (!observers.contains(o)) return;
        observers.remove(o);
    }

    public void notifyObservers() {
        if (changed) {
            for (Observer o : observers) {
                o.update(temperature, humidity, pressure);
            }
            clearChanged();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        setChanged();
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    protected void setChanged() {
        changed = true;
    }

    protected void clearChanged() {
        changed = false;
    }
}
