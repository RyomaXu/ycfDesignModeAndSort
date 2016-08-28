package com.ycf.designMode.adaptee.obj_adaptee.impl;

import com.ycf.designMode.adaptee.obj_adaptee.Duck;
import com.ycf.designMode.adaptee.obj_adaptee.Turkey;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	public TurkeyAdapter(Turkey turkey){
		this.turkey=turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
