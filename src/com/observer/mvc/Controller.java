﻿package com.observer.mvc;

import com.observer.inter.IObserver;

public class Controller {
	private BaseViews view;
	private BaseModels model;

	public Controller(BaseViews view) {
		super();
		this.view = view;

		model = new Model();
		// 将view与model绑定
		model.addObserver(view);
	}

	public void doSomething() {
		System.out.println("controller响应view的界面操作事件，通知model更新");

		model.requestData();

	}

}
