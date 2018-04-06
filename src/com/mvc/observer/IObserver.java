/**
 * 
 */
package com.mvc.observer;

/**
 * 观察者接口
 */
public interface IObserver {
	/**
	 * 观察者方法
	 * @param subject：被观察者抽象层对象
	 * @param o：额外信息
	 */
	public void update(IObservable observable, Object o);
}
