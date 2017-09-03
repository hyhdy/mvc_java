package com.mvc.example;

import com.mvc.base.BaseModels;
import com.mvc.base.BaseViews;

public class View extends BaseViews {
	

	public void touch() {
		System.out.println("模拟屏幕操作，触发响应事件，将事件传给controller处理");
		// 将事件传给controller处理
		controller.doSomething();
	}

	/**
	 * 刷新界面
	 */
	@Override
	public void refreshView(BaseModels baseModel, Object o) {
		if (baseModel instanceof Model) {
			Model model = (Model) baseModel;
			String name = model.getName();
			String display = model.getDisplay();
			System.out.println("收到Model通知，更新界面");
			System.out.println("Model包含以下数据:");
			System.out.println("name=" + name + " ,display=" + display);
		}

	}

}
