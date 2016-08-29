package com.ycf.designMode.registTree;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Factory factory=new Factory();
		Person man=factory.getPerson("man");
	    System.out.println(man.toString());//com.ycf.designMode.registTree.Man@19b7c62
	    Person manOther=factory.getPerson("man");
	    System.out.println(manOther.toString());//com.ycf.designMode.registTree.Man@19b7c62
		Person woman=factory.getPerson("woman");
		System.out.println(woman.toString());
	}

}
