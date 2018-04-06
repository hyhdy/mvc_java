package com.mvc.base;

import java.util.ArrayList;
import java.util.List;

import com.mvc.action.IModelAction;
import com.mvc.observer.IObservable;
import com.mvc.observer.IObserver;

/**
 * model抽象类，实现基本方法
 * @author hyh
 */
public abstract class BaseModels implements IObservable, IModelAction {
	private List<IObserver> mObservers;
	private boolean mIsChanged;

	public BaseModels() {
		mObservers = new ArrayList<IObserver>();
	}

	@Override
	public void addObserver(IObserver observer) {
		if (mObservers == null) {
			return;
		}

		mObservers.add(observer);
	}

	@Override
	public void deleteObserver(IObserver observer) {
		if (mObservers == null || mObservers.size() == 0) {
			return;
		}

		mObservers.remove(observer);

	}

	@Override
	public void notifyUpdate() {
		notifyUpdate(null);
	}

	@Override
	public void notifyUpdate(Object object) {

		if (mObservers == null || mObservers.size() == 0) {
			return;
		}

		for (IObserver observer : mObservers) {
			observer.update(this, object);
		}

	}

	public boolean isChanged() {
		return mIsChanged;
	}

	public void setChanged(boolean mIsChanged) {
		this.mIsChanged = mIsChanged;
	}

}
