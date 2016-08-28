package com.ycf.designMode.observer;

/**
 * 具体观察者和功能类
 * @author yan gui
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temp;
	private float humidity; 
	private float pressure;
	private Subject subject;
	
	public CurrentConditionsDisplay(Subject subject){
		this.subject=subject;
		subject.registerObserver(this);
	}
	@Override
	public void display() {
        System.out.println("温度："+temp);
        System.out.println("湿度："+humidity);
        System.out.println("压力："+pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}

}
