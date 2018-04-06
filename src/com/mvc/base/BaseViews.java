package com.mvc.base;

import com.mvc.action.IViewAction;
import com.mvc.example.Controller;
import com.mvc.observer.IObservable;
import com.mvc.observer.IObserver;
/**
 * 可以定义一些基本行为，通过模板方法模式进行代码复用
 *
 */
public abstract class BaseViews implements IObserver,IViewAction{
	protected Controller controller;// 控制器

	public BaseViews() {
		controller = new Controller(this);
	}
	
	@Override
	public void update(IObservable observable, Object o) {
		if(observable instanceof BaseModels) {
			BaseModels baseModel=(BaseModels)observable;
			if(baseModel.isChanged()) {
			//model数据改变才刷新view
			refreshView(baseModel,o);
			}
		}
		
	}
}
