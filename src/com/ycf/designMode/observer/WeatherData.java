package com.ycf.designMode.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 被观察的对象
 * @author yan gui
 *
 */
public class WeatherData implements Subject {
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
