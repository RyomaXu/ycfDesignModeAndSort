package com.ycf.designMode.adaptee.obj_adaptee;

import static org.junit.Assert.*;

import com.ycf.designMode.adaptee.obj_adaptee.impl.AdapteeImpl;
import com.ycf.designMode.adaptee.obj_adaptee.impl.TargetImpl;

public class Test {

	@org.junit.Test
	public void test() {
		Adaptee adaptee=new AdapteeImpl();
		adaptee.gobble();
		
		
		Target target=new TargetImpl();
		Adapter adapter=new Adapter(target);
		adapter.gobble();
		
	}

}
