/**
 * 
 */
package com.observer.inter;

/**
 * @author hyh 被观察者接口
 */
public interface IObservable {

	public void addObserver(IObserver observer);

	public void deleteObserver(IObserver observer);

	public void notifyUpdate();

	public void notifyUpdate(Object object);
}
