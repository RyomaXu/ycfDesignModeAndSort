package com.ycf.designMode.registTree;

/**
 * 采用单例模式
 * @author yan gui
 *
 */
public class Woman implements Person{
	private volatile static Woman uniqueInstance;
	  private Woman(){
	  }
	  public static Woman getInstance(){
		  //减少时间耗费
		  if(uniqueInstance==null){
			  synchronized (Woman.class) {
				if(uniqueInstance==null){
					uniqueInstance=new Woman();
				}
			}
		  }
		  return uniqueInstance;
	  }
}
