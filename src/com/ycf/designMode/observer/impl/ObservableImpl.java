package com.ycf.designMode.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.ycf.designMode.observer.Observer;
import com.ycf.designMode.observer.Observable;


/**
 * 具体可观察者
 * @author yan gui
 *
 */
public class ObservableImpl implements Observable {
	private List<Observer> observers=new ArrayList<Observer>();
	private float temp;
	private float humidity; 
	private float pressure;
	public void setMessage(float temp,float humidity,float pressure){
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure);
		}
	}

}
