package com.ycf.designMode.adaptee.class_adaptee;

import static org.junit.Assert.*;

import com.ycf.designMode.adaptee.class_adaptee.impl.AdapteeImpl;
import com.ycf.designMode.adaptee.class_adaptee.impl.TargetImpl;

public class Test {

	@org.junit.Test
	public void test() {
		Adaptee adaptee=new AdapteeImpl();
		adaptee.gobble();
		Adapter adapter=new Adapter();
		adapter.gobble();
	}

}
