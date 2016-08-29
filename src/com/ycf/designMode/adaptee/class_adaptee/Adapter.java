package com.ycf.designMode.adaptee.class_adaptee;
/**
 * 类的适配器模式
 * 采用继承Adaptee,Target的方式实现
 */
import com.ycf.designMode.adaptee.class_adaptee.impl.TargetImpl;

public class Adapter extends TargetImpl implements Adaptee{

	@Override
	public void gobble() {
		this.quack();
	}

	
	

}
