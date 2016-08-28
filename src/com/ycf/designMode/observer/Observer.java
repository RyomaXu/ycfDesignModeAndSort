package com.ycf.designMode.observer;
/**
 * 观察者
 * @author yan gui
 *
 */
public interface Observer {
  public void update(float temp,float humidity,float pressure);
}
