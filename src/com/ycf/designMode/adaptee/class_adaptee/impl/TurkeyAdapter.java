package com.ycf.designMode.adaptee.class_adaptee.impl;
/**
 * 类的适配器模式
 * 采用继承Adaptee,Target的方式实现
 */
import com.ycf.designMode.adaptee.obj_adaptee.Duck;
import com.ycf.designMode.adaptee.obj_adaptee.Turkey;

public class TurkeyAdapter extends TurkeyImpl implements Duck{

	@Override
	public void quack() {
		this.gobble();
	}


	

}
