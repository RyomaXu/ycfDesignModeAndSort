package com.ycf.designMode.registTree;
/**
 * 工厂类
 * @author yan gui
 *
 */
public class Factory {
  public static Person getPerson(String key){
	  //使用注册者模式
	  Person person=RegistUtils.get(key);
	  if(person==null){
		  person=createPerson(key);
		  RegistUtils.set(key, person);
	  }
	  return person;
  }

private static Person createPerson(String key) {
	Person person=null;
	if("man".equals(key)){
		person=Man.getInstance();
	}else if("woman".equals(key)){
		person=Woman.getInstance();
	}
	return person;
}
}
