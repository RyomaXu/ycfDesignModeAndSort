package com.ycf.designMode.observer;

import com.ycf.designMode.observer.impl.CurrentConditionsDisplay;
import com.ycf.designMode.observer.impl.ObservableImpl;

public class Test {

	public static void main(String[] args) {
		ObservableImpl weatherData=new ObservableImpl();
		CurrentConditionsDisplay display=new CurrentConditionsDisplay(weatherData);
		weatherData.setMessage(30, 111, 200f);
	}

}
