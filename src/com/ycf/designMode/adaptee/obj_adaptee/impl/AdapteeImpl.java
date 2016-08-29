package com.ycf.designMode.adaptee.obj_adaptee.impl;

import com.ycf.designMode.adaptee.obj_adaptee.Adaptee;

public class AdapteeImpl implements Adaptee {

	@Override
	public void gobble() {
		System.out.println("对象************待适配的************");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
