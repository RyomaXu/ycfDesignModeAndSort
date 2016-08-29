package com.ycf.designMode.adaptee.obj_adaptee;

/**
 * 对象的适配器模式
 * 采用组合的方式实现
 */
public class Adapter implements Adaptee {
	private Target turkey;
	public Adapter(Target turkey){
		this.turkey=turkey;
	}
	@Override
	public void gobble() {
		turkey.quack();
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	


}
