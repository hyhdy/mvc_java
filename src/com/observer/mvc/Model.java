package com.observer.mvc;

public class Model extends BaseModels {
	/**
	 * Model的一些属性
	 */
	private String name;// 名字
	private String display;// 展示数据

	private BaseViews view;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	@Override
	public void requestData() {
		// 模拟model更新
		setName("杰伦");
		setDisplay("哎呦，不错哦");

		// 设置改变
		setChanged(true);
		System.out.println("model发生了改变，通知view更新");
		notifyUpdate();
	}

}
