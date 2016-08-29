package com.ycf.designMode.observer;
/**
 * 可观察者
 * @author yan gui
 *
 */
public interface Observable {
   public void registerObserver(Observer observer);
   public void removeObserver(Observer observer);
   public void notifyObservers();
}
