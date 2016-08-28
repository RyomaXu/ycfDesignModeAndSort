package com.ycf.designMode.observer;
/**
 * 对观察者操作的类
 * @author yan gui
 *
 */
public interface Subject {
   public void registerObserver(Observer observer);
   public void removeObserver(Observer observer);
   public void notifyObservers();
}
