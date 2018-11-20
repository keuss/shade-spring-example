package com.keuss;

public class MyBean implements MyBeanITF {

	private String name;
	private int time;

	public MyBean(String name, int time){
		this.name=name;
		this.time=time;
	} 
	public String getName() {
		return name;
	}
	
	public int getTime() {
		return time;
	}
}
 