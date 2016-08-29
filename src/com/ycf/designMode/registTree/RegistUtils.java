package com.ycf.designMode.registTree;

import java.util.HashMap;
import java.util.Map;
/**
 * 注册类
 * @author yan gui
 *
 */
public class RegistUtils {

	private static Map<String,Person> register=new HashMap<String,Person>();
	public static Person get(String registrantName){
		if(register.isEmpty()){
			return null;
		}else{
			return register.get(registrantName);
		}
	}
	public static void set(String registrantName,Person person){
		register.put(registrantName, person);
	}
}
