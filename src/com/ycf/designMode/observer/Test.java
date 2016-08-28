package com.ycf.designMode.observer;

public class Test {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay display=new CurrentConditionsDisplay(weatherData);
		weatherData.setMessage(30, 111, 200f);
	}

}
