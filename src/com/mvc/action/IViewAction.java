package com.mvc.action;

import com.mvc.base.BaseModels;
import com.mvc.observer.IObservable;

/**
 * 定义视图的基本行为
 */
public interface IViewAction {
	/**
	 * 刷新视图
	 * @param baseModel
	 * @param o
	 */
	public void refreshView(BaseModels baseModel, Object o);
}
