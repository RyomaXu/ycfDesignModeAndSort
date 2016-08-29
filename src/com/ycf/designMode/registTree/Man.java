package com.ycf.designMode.registTree;

/**
 * 采用单例模式
 * @author yan gui
 *
 */
public class Man  implements Person{
	private volatile static Man uniqueInstance;
	  private Man(){
	  }
	  public static Man getInstance(){
		  //减少时间耗费
		  if(uniqueInstance==null){
			  synchronized (Man.class) {
				if(uniqueInstance==null){
					uniqueInstance=new Man();
				}
			}
		  }
		  return uniqueInstance;
	  }
}
