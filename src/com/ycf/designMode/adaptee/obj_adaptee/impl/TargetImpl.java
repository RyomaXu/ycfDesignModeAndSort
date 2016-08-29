package com.ycf.designMode.adaptee.obj_adaptee.impl;

import com.ycf.designMode.adaptee.obj_adaptee.Target;

public class TargetImpl implements Target {

	@Override
	public void quack() {
		System.out.println("对象----------------已完成适配----------");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
