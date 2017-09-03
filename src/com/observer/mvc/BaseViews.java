package com.observer.mvc;

import com.action.inter.IViewAction;
import com.observer.inter.IObservable;
import com.observer.inter.IObserver;
/**
 * 可以定义一些基本行为，通过模板方法模式进行代码复用
 * @author lenovo
 *
 */
public abstract class BaseViews implements IObserver,IViewAction{
	
	
	@Override
	public void update(IObservable observable, Object o) {
		if(observable instanceof BaseModels) {
			BaseModels baseModel=(BaseModels)observable;
			if(baseModel.isChanged()) {
			refreshView(baseModel,o);
			}
		}
		
	}
}
