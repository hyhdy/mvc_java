package com.action.inter;

import com.observer.inter.IObservable;
import com.observer.mvc.BaseModels;

/**
 * 定义视图的基本行为
 * 
 * @author hyh
 *
 */
public interface IViewAction {
	/**
	 * 刷新视图
	 * 
	 * @param baseModel
	 * @param o
	 */
	public void refreshView(BaseModels baseModel, Object o);
}
