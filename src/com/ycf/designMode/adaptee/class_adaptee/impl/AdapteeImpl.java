package com.ycf.designMode.adaptee.class_adaptee.impl;

import com.ycf.designMode.adaptee.class_adaptee.Adaptee;

public class AdapteeImpl implements Adaptee {

	@Override
	public void gobble() {
		System.out.println("类************待适配的************");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
